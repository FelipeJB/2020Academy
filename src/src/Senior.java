public class Senior extends Globantmodel {

    public Senior (int i, String j, int s, boolean b) {
        this.id=i;
        this.nombre=j;
        this.salary=s;
        this.assigned=b;
    }

    @Override
    public void Office() {
        System.out.println("Va a la oficina (Clase Senior)");
    }

    @Override
    public void lead() {
        System.out.println("Ordena (Clase Senior)");
    }

    public void Meeting() {
        System.out.println("Hace reuniones");
    }

}
