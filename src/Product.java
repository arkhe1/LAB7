public class Product {

    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void buyOne() {
        if(stock > 0) {
            stock--;
        } else {
            System.out.println("Out of stock");
        }
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println(name + " - Stock: " + stock);
    }
}
