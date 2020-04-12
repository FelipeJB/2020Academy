import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory1 = new Inventory();
        Scanner menu = new Scanner(System.in);
        boolean exit = false;
        int opcion = 0;
        while (!exit) {
            System.out.println("Bienvenido seleccione la transaccion a realizar:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Stock disponible venta");
            System.out.println("4. Borrar producto");
            System.out.println("5. Exit");

            opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    Person product=new Person();
                    Scanner productInformation = new Scanner(System.in);
                    System.out.println("Ingrese nombre del producto:");
                    String productName = productInformation.nextLine();
                    product.name = productName;
                    System.out.println("Ingrese codigo del inventario:");
                    int productCode = productInformation.nextInt();
                    product.code = productCode;
                    System.out.println("Ingrese precio del producto:");
                    int productPrice = productInformation.nextInt();
                    product.price = productPrice;
                    System.out.println("Ingrese cantidad del producto:");
                    int productQuantity = productInformation.nextInt();
                    product.quantity = productQuantity;
                    inventory1.addProduct(product);
                    break;
                case 2:
                    System.out.println("The whole product list is: " );
                    inventory1.displayProducts();

                    break;
                case 3:
                    System.out.println("Stock disponible para venta");
                    inventory1.stockAvailable();
                    break;
                case 4:
                    productInformation = new Scanner(System.in);
                    System.out.println("Digite codigo del producto a eliminar:");
                    int code = productInformation.nextInt();
                    inventory1.deleteProduct(code);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Just numbers between 1 and 5");
            }
        }


    }
}
