public class BookDemo {
    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", 300);

        Book b2 = b1;
        b2.addPages(20);

        b1.printBook();
        b2.printBook();

        Book b3 = new Book(b1.title, b1.pages);

        System.out.println(b1);
        System.out.println(b3);

        System.out.println(b1.title.equals(b3.title));
        System.out.println(b1.pages == b3.pages);
    }
}
