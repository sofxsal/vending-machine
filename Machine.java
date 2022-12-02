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

    // 3. The Big 3 - set method
    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }

    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */
}
