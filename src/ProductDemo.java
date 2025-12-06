import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many products? ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] arr = new Product[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Product name: ");
            String name = sc.nextLine();

            System.out.print("Stock: ");
            int stock = sc.nextInt();
            sc.nextLine();

            arr[i] = new Product(name, stock);
        }

        while(true) {
            System.out.print("Enter product name to buy (or Q to quit): ");
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("Q")) break;

            boolean found = false;

            for(int i = 0; i < n; i++) {
                if(arr[i].getName().equalsIgnoreCase(input)) {
                    found = true;
                    arr[i].buyOne();
                }
            }

            if(!found) {
                System.out.println("No such product!");
            }
        }

        for(int i = 0; i < n; i++) {
            arr[i].printInfo();
        }
    }
}
