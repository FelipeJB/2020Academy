public class Tl extends Globantmodel  {

    public Tl (int i, String j, int s, boolean b) {
        this.id=i;
        this.nombre=j;
        this.salary=s;
        this.assigned=b;
    }
    @Override
    public void Office() {
        System.out.println("No Va a la oficina (Clase Tl)");
    }

    @Override
    public void lead() {
        System.out.println("Ordena (Clase Tl)");
    }

    public void Manage() {
        System.out.println("Maneja Junior y Seniors");
    }
}
