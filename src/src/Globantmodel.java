//Clase abstracta Glober
public abstract class Globantmodel {
    protected int id;
    protected String nombre;
    protected int salary;
    protected boolean assigned;

    public void Work() {
        System.out.println("Trabaja En Globant (Clase Padre)");
    }

    public void Office() {
        System.out.println("Va a la oficina (Clase Padre)");
    }

    //Declaración del método abstracto lead()
    public abstract void lead ( );
}


