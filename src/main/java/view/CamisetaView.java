package view;

import controllers.CamisetaController;

public class CamisetaView {

    public static void main(String[] args) {
        CamisetaController camisetaController = new CamisetaController();

        // Crear camisetas
        System.out.println(camisetaController.createCamiseta("Nike Air", "Deportiva", "Unisex", "M", "Negro", 599.99, 15));
        System.out.println(camisetaController.createCamiseta("Adidas Clásica", "Casual", "Hombre", "L", "Blanco", 499.99, 10));
        System.out.println(camisetaController.createCamiseta("Puma Fit", "Deportiva", "Mujer", "S", "Rosa", 549.50, 8));

        // Actualizar
        System.out.println(camisetaController.updateCamiseta(2, "Adidas Original"));

        // Obtener
        System.out.println(camisetaController.getCamiseta(2));

        // Eliminar
        System.out.println(camisetaController.deleteCamiseta(1));
        System.out.println(camisetaController.deleteCamiseta(3));
    }
}
