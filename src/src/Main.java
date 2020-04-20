// Liberia.
import java.util.ArrayList;

public class Main {
    // ArrayList de objetos Globantmodel
    public static ArrayList<Globantmodel> globers = new ArrayList<Globantmodel>();
    public static void main(String[] args) {
        Globantmodel junior = new Junior(1,"fredy",1,true);
        Globantmodel senior = new Senior(2,"Juan",2,true);
        Globantmodel tl = new Tl(3,"Raul",3,true);

        globers.add(junior);
        globers.add(senior);
        globers.add(tl);

        // trabaja
        System.out.println("Globant Trabajo.");
        for (Globantmodel integrands : globers) {
            System.out.print(integrands.id + " " + integrands.nombre + " -> ");
            integrands.Work();
        }
        // Lead
        System.out.println("Roles de Globant liderar.");
        for (Globantmodel integrands : globers) {
            System.out.print(integrands.id + " " + integrands.nombre + " -> ");
            integrands.lead();
        }
        //Oficina
        System.out.println("Roles de Globant Oficina.");
        for (Globantmodel integrands : globers) {
            System.out.print(integrands.id + " " + integrands.nombre + " -> ");
            integrands.Office();
            }
        // Junior
        System.out.println("Solo Junior tiene atributo Win");
        System.out.print(junior.nombre + " " + junior.salary + " -> ");
        ((Junior) junior).win();
        // Senior
        System.out.println("Solo Senior tiene atributo Meeting");
        System.out.print(senior.nombre + " " + senior.salary + " -> ");
        ((Senior) senior).Meeting();
        // Tl
        System.out.println("Solo Tl tiene atributo Office");
        System.out.print(tl.nombre + " " + tl.salary + " -> ");
        ((Tl) tl).Manage();
    }
}
