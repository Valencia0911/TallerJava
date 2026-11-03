public class Main {

    public static void main(String[] args) {
        String nombreP = "Café";
        double precio = 4500;
        int cantidadInventario = 3;
        boolean disponibilidad = false;
        char codigoP = 'C';


        double subtotal = 42500;
        double descuento = 0;
        double total = 0;
        boolean tieneDescuento = false;
        if (subtotal > 30000) {
            descuento = subtotal * 0.15;
            total = subtotal - descuento;
            tieneDescuento = true;
        }
        System.out.printf("Valor del descuento: $%.2f%n", descuento);
        System.out.printf("Total a pagar: $%.2f%n", total);
        System.out.printf("Derecho al descuento: %b%n", tieneDescuento);

        switch (codigoP) {
            case 'B':
                System.out.println("Bebidas calientes: 0% IVA");
                break;
            case 'F':
                System.out.println("Bebidas frias: 5% IVA");
                break;
            case 'C':
                System.out.println("Comida: 8% IVA");
                break;
            case 'P':
                System.out.println("Postres: 8% IVA");
                break;
            default:
                System.out.println("No se reconoió el código");
                break;

        }
        int inventario = 50;
        int consumoPedido = 2;
        while (inventario >= 10) {
            inventario = inventario - consumoPedido;
            System.out.println("Inventario: " + inventario);
        }
        double monto = 0;

        do {
            if (monto <= 0) {
                System.out.println("Monto inválido. Intente nuevamente.");
                monto = 50000;
            }

        } while (monto <= 0);
        System.out.println("Monto de apertura aceptado: $" + monto);

        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        double acumulador = 0;

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " - $" + precios[i]);
            acumulador = acumulador + precios[i];

        }
        double promedio = 0;
        promedio = acumulador / productos.length;
        System.out.println("Promedio: " + promedio);

    }

    /*public class CajaRegistradora {
        public static void main(String[] args) {
            int
                    cantidadVendida = "5"; NO PUEDE TENER COMILLAS
            double precioUnitario = 4500;
            double total = cantidadVendida * precioUnitario FALTA PUNTO Y COMA (no se si la borré organizando, revisar)
            boolean aplicaDescuento = (total > 20000);
            if (aplicaDescuento = true) { FALTA OTRO = PARA LA COMPARACIÓN
                                   YA ESTÁ INICIALIZADO CON TRUE, NO SE DEBE COMPARAR CON TRUE
                total = total - (total * 0.10);
            }
            System.out.println("Total: " + total);
        }
    }
*/
}
