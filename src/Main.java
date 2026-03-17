//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("book", "Author", 100, true);
        book1.printInfo();
        System.out.println("------------");
        book1.borrow();
        System.out.println("------------");
        book1.printInfo();
    }
}