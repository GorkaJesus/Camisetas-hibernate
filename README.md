# Proyecto Hibernate ORM - CRUD de Camisetas

## Descripción
Este proyecto implementa un sistema básico **CRUD** (Create, Read, Update, Delete) para la gestión de **camisetas** utilizando **Hibernate ORM** con **MySQL**.  
Permite registrar, consultar, actualizar y eliminar camisetas de manera persistente en la base de datos.  
Es un proyecto educativo para aprender a integrar Java, Hibernate y MySQL.

---

## Autor
**Gorka Jesus Quesada Vega**  
2º DAM T (Desarrollo de Aplicaciones Multiplataforma)

---

## Tecnologías Utilizadas
- **Java**  
- **Hibernate ORM 6.3.1**  
- **MySQL**  
- **Maven**

---

## Funcionalidades
- Crear nuevas camisetas  
- Actualizar información de camisetas  
- Consultar camisetas por ID  
- Eliminar camisetas  
- Persistencia automática en base de datos MySQL

---

## Estructura del Proyecto
com.hzcode/
├─ src/
│ ├─ controllers/CamisetaController.java
│ ├─ models/Camiseta.java
│ └─ view/CamisetaView.java
├─ resources/hibernate.cfg.xml
└─ pom.xml

yaml
Copiar código

---

## Tabla de Atributos de Camisetas
| Atributo   | Tipo    | Descripción                                |
|------------|---------|--------------------------------------------|
| id         | Long    | Identificador único (autogenerado)        |
| nombre     | String  | Nombre de la camiseta                      |
| categoria  | String  | Categoría o tipo de la camiseta           |
| sexo       | String  | Sexo recomendado (Hombre, Mujer, Unisex) |
| talla      | String  | Talla de la camiseta (S, M, L, XL…)       |
| color      | String  | Color de la camiseta                       |
| precio     | Double  | Precio en euros                            |
| stock      | Integer | Cantidad disponible                        |

---

## Instalación y Configuración

### Requisitos
- Java JDK 17 o superior  
- Maven 3.x  
- MySQL 8.x  
- Eclipse IDE o cualquier IDE de Java compatible

### Configuración de la Base de Datos
1. Crear la base de datos:
```sql
CREATE DATABASE tutorial;
Configurar usuario y contraseña en hibernate.cfg.xml:

xml
Copiar código
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">TU_CONTRASEÑA</property>
Configuración del Proyecto
Clonar o descargar el proyecto.

Importar el proyecto en Eclipse como proyecto Maven.

Verificar que las dependencias de Hibernate y MySQL están en pom.xml.

Ejecución
Ejecutar la clase CamisetaView.java desde Eclipse.

Probar las operaciones CRUD:

Crear nueva camiseta

Consultar camiseta por ID

Actualizar información

Eliminar camiseta

Referencias
Video Tutorial Hibernate ORM: https://www.youtube.com/watch?v=F-wNCahL0&t=1670s

Notas
Este proyecto es educativo y sirve como base para aprender Hibernate ORM, gestión de entidades, persistencia en bases de datos y CRUD básico en Java.

Se recomienda no subir la base de datos ni archivos binarios al repositorio GitHub.
