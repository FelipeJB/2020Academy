import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory1 = new Inventory();
        Scanner menu = new Scanner(System.in);
        boolean exit = false;
        int opcion = 0;
        while (!exit) {
            System.out.println("Welcome select your option:");
            System.out.println("1. Log in");
            System.out.println("2. Admin");
            System.out.println("3. Exit");

            opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    if (Person.containsKey(userName)){
                        if (Person.password== Person.get(password)){
                            Scanner menu = new Scanner(System.in);
                            boolean exit = false;
                            int opcion = 0;
                            while (!exit) {
                                System.out.println("1. Balance");
                                System.out.println("2. Add Money");
                                System.out.println("3. Withdraw");
                                System.out.println("4. Transfer");
                                System.out.println("5. Exit");

                                opcion = menu.nextInt();

                                switch (opcion) {
                                    case 1:
                                        System.out.println("Your current balance is: "+account1.balance());
                                        break;
                                    case 2:
                                        System.out.println("Ammount to add");
                                        int ammountToAdd = Integer.parseInt(userInformation.nextLine());
                                        account1.ammountAdd = ammountToAdd;
                                        System.out.println("Your new balance is: "+account1.addMoney());
                                        break;
                                    case 3:
                                        System.out.println("Ammount to withdraw");
                                        int ammountToRetrieve = Integer.parseInt(userInformation.nextLine());
                                        account1.ammountToWithdraw = ammountToRetrieve;
                                        System.out.println(account1.withdraw()+"\nYour balance is : "+account1.amountTotal);
                                        break;
                                    case 4:
                                        exit = true;
                                        break;
                                    default:
                                        System.out.println("Just numbers between 1 and 4");
                                }

                            }

                        }
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
                            exit = true;
                            break;
                        default:
                            System.out.println("Just numbers between 1 and 3");
                    }
            }


        }
    }
