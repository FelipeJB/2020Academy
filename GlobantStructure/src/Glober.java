public abstract class Glober {
    public String name;
    public String id;
    public int salary;
    public String rol;

    public Glober(String name, String id, int salary, String rol) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.rol = rol;
    }

    public Glober() {
    }

    public abstract void functions();

    @Override
    public String toString() {
        return "Glober{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", rol='" + rol + '\'' +
                '}';
    }
}
