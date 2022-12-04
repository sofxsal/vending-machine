import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
    
        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item(" Fresca", 1.49, 3), new Item(" Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item(" Barq's", 1.49, 2), new Item(" A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item(" C-Cola", 1.49, 2), new Item(" Berry", 2.49, 1) }
        };
        

        // 2.3. create machine object of Machine class
        Machine machine = new Machine(items);

        // 4. create scanner
        Scanner scan = new Scanner(System.in);

        // 4.3 create a while loop

        while (true) {
            System.out.println("Pick a row: ");
            int row = scan.nextInt();

            System.out.println("Pick a spot in the row: ");
            int spot = scan.nextInt();

            // 4.2 dispense the drink
            machine.dispense(row, spot);
            System.out.println("\n" + machine);
        }

        
    }
}
