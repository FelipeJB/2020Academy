import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Glober role =new jrEngineer();
        Glober role1 =new seniorEngineer();
        Glober role2 =new TechLead();
        role.skills();

        System.out.println("Glober");
        role.skills();
        role.name("john");
        role.salary(7897564);
        role.project(true);

        Scanner menu = new Scanner(System.in);
        boolean exit = false;
        int opcion = 0;
        while (!exit) {
            System.out.println("Bienvenido seleccione la transaccion a realizar:");
            System.out.println("1. Agregar Skill");
            System.out.println("2. Mostrar Skills");
            System.out.println("3. Borrar Skill");
            System.out.println("4. Exit");

            opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    Skills skill=new Skills();
                    Scanner productInformation = new Scanner(System.in);
                    System.out.println("Ingrese nombre del producto:");
                    String skillNew = productInformation.nextLine();
                    Skills.addSkill(skillNew);
                    break;
                case 2:
                    System.out.println("The whole product list is: " );
                    Skills.displaySkills();
                    break;
                case 3:
                    productInformation = new Scanner(System.in);
                    System.out.println("Digite codigo del producto a eliminar:");
                    int i = productInformation.nextInt();
                    Skills.deleteSkill(i);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Just numbers between 1 and 4");
            }
        }
    }


    }

