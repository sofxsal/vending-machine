public class Item {
    
    private String name;
    private String price;
    private int quantity;

    // 1. Create Constructor
    public Item(String name, String price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 2. get method
    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    // 3. set method
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
