public abstract class Glober{
    public void name (String name){
        System.out.println("Name: "+name);
    }
    public void role (String role){
        System.out.println("role: "+role);
    };
    public void salary(double salary){
        System.out.println("Salary: "+salary);
    }
    public void project (boolean project) {
        System.out.println("Is in a current project: "+project);
    }
    public abstract void skills();
      }

