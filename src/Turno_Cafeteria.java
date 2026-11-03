public class Turno_Cafeteria {
    public static void main(String[] args) {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida,P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido
        int inventarioBrownie= 10;
        int monto=-6;
        int pedidosProcesados = 0;
        double totalRecaudado = 0;
        double pedidoMayor = 0;
        int numeroPedidoMayor = 0;

        do {
            if (monto <= 0) {
                System.out.println("Monto inválido. Intente nuevamente.");
                monto = 50000;
            }
        }while (monto <= 0);

        for (int i = 0; i < pedidoProducto.length; i++) {
            int indice = pedidoProducto[i];
            if(indice==4){
                if(pedidoCantidad[i]<=inventarioBrownie) {
                    inventarioBrownie=inventarioBrownie-pedidoCantidad[i];
                }else {
                    System.out.println("El producto está agotado");
                    continue;
                }
            }

            System.out.println("Producto: " + nombres[indice]);
            System.out.println("Precio: $" + precios[indice]);
            System.out.println("Categoría: " + categorias[indice]);
            System.out.println("Cantidad: " + pedidoCantidad[i]);

            double subtotal = precios[indice] * pedidoCantidad[i];
            System.out.println("Subtotal: $" + subtotal);

            double descuento = 0;
            double total = 0;
            if (subtotal > 12000) {
                descuento = subtotal * 0.10;
                total = subtotal - descuento;
                System.out.println("Se aplica descuento");
            }else{
                total = subtotal ;
                System.out.println("No se aplica el descuento");
            }
            System.out.println("Valor del descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);

            pedidosProcesados++;
            totalRecaudado += total;

            if (total > pedidoMayor) {
                pedidoMayor = total;
                numeroPedidoMayor = i + 1;
            }

            switch (categorias[indice]) {
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

        }
        System.out.println("\n========== CIERRE DE CAJA ==========");
        System.out.println("Pedidos procesados: " + pedidosProcesados);
        System.out.println("Total recaudado: $" + totalRecaudado);
        System.out.println("Número del pedido con mayor valor: " + numeroPedidoMayor);
        System.out.println("Valor del pedido mayor: $" + pedidoMayor);

    }
}