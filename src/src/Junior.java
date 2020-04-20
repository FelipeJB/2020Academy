public class Junior extends Globantmodel{

    public Junior (int i, String j, int s, boolean b) {
        this.id=i;
        this.nombre=j;
        this.salary=s;
        this.assigned=b;
    }

    @Override
    public void Office() {
        System.out.println("Va a la oficina (Clase Junior)");
    }

    @Override
    public void lead ( ) {
        System.out.println("No Ordena");
    }

    public void win() {
        System.out.println("Gana poco");
    }


}
