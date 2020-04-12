import java.util.*;

public class Inventory {
    Map <
    Map <Integer, Person> people = new HashMap();


    public void addPerson (Person person) {

        people.put(person.code, person);

    }

    public void displayInformation() {

        for (Integer key : people.keySet()) {
            System.out.println(people.get(key));
        }

    }

    public void deleteProduct(int code) {
        people.remove(code);
        System.out.println(people);
}

    public void stockAvailable() {
        for (Integer key : people.keySet()) {
            if (people.get(key).quantity > 0) {
                System.out.println(people.get(key));
            }
        }

    }

}

