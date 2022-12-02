public class Item {
    
    // 1. add fields
    private String name;
    private String price;
    private int quantity;

    // 2. The Big 3 - Constructor
    public Item(String name, String price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 3. copy constructor
    public Item (Item source) {
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }

    // 2. The Big 3 - get method
    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    // 2. The Big 3 - set method
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // 4. toString Method
    public String toString() {
        return name + ": " + price + " (" + quantity + ")";
    }



}
