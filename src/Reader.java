public class Reader {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, String cardNumber, int borrowedCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = 0;
    }

    public void printData() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Borrowed Count: " + borrowedCount);
    }

    public void increaseBorrowedCount() {
        borrowedCount++;
    }

    public void decreaseBorrowedCount() {
        if (borrowedCount > 0) {
            borrowedCount--;
        }
    }
}
