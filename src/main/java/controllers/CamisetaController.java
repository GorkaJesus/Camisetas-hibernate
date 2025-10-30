package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import models.Camiseta;

public class CamisetaController {

    private SessionFactory getSessionFactory() {
        return new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Camiseta.class)
                .buildSessionFactory();
    }

    // Crear camiseta
    public String createCamiseta(String nombre, String categoria, String sexo, String talla, String color, Double precio, Integer stock) {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Camiseta camiseta = new Camiseta(nombre, categoria, sexo, talla, color, precio, stock);
            Transaction tx = session.beginTransaction();
            session.persist(camiseta);
            tx.commit();
            return "Camiseta creada correctamente";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al registrar la camiseta";
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    // Actualizar nombre de una camiseta
    public String updateCamiseta(int id, String nuevoNombre) {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction tx = session.beginTransaction();
            Camiseta camiseta = session.get(Camiseta.class, id);
            if (camiseta != null) {
                camiseta.setNombre(nuevoNombre);
                session.merge(camiseta);
                tx.commit();
                return "Camiseta actualizada correctamente";
            } else {
                return "Camiseta no encontrada";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al actualizar la camiseta";
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    // Obtener camiseta por id
    public String getCamiseta(int id) {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Camiseta camiseta = session.get(Camiseta.class, id);
            if (camiseta != null) {
                return "Camiseta: " + camiseta.getNombre() +
                       "Categoría: " + camiseta.getCategoria() +
                       "Sexo: " + camiseta.getSexo() +
                       "Talla: " + camiseta.getTalla() +
                       "Color: " + camiseta.getColor() +
                       "Precio: $" + camiseta.getPrecio() +
                       "Stock: " + camiseta.getStock();
            } else {
                return "Camiseta no encontrada";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al obtener la camiseta";
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

    // Eliminar camiseta por id
    public String deleteCamiseta(int id) {
        SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction tx = session.beginTransaction();
            Camiseta camiseta = session.get(Camiseta.class, id);
            if (camiseta != null) {
                session.remove(camiseta);
                tx.commit();
                return "Camiseta eliminada correctamente";
            } else {
                return "Camiseta no encontrada";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al eliminar la camiseta";
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
