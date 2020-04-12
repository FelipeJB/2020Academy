public class Person {
    public String name;
    public double price;
    public int quantity;
    public int code;

    @Override
    public String toString() {
        return "Product: \n" +
                "Code:" + code + '\n' +
                "Name: " + name + '\n' +
                "Price: " + price + '\n'+
                "Quantity: " + quantity + '\n';
    }
}
