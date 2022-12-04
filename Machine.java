public class Machine {
    
    // 1. add fields
    // items are arranged in rows, hence 2d arrays
    private Item[][] items;

    // 2. The Big 3 - Constructor
    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];
        
        for(int i = 0; i < items.length; i++) {
            for(int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
            
        }
    }

    // 2. The Big 3 - get method
    public Item getItem(int row, int spot) {
        return new Item(items[row][spot]);
    }

    // 2. The Big 3 - set method
    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }

    // 2.4 dispense function
        // check if requested item has a quantity > 0
            // if yes --> decrease quantity by 1 and returns true
            // else no --> returns false
    
    public boolean dispense(int row, int spot) {
        if (this.items[row][spot].getQuantity() > 0) {
            this.items[row][spot].setQuantity(this.items[row][spot].getQuantity() - 1);
            return true;
        } else {
            return false;
        }
    }


    // 3.1 add toString method
    public String toString() {
        String temp = "";

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                temp += this.items[i][j].toString();
            }
        }

        return temp;
    }
}

// String temp = "";
// for (int i = 0; i < this.cars.length; i++) {
//     temp += "Parking Spot: " + i + "\n";
//     if (this.cars[i] == null) {
//         temp += "Empty\n";
//     } else {
//         temp += this.cars[i].toString() + "\n";
//     }
// }
// return temp;