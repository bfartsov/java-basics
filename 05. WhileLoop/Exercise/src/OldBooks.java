import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String searchingBook = scan.nextLine();
        int libraryBooks = Integer.parseInt(scan.nextLine());
        int checkedBooks = 0;

        while (true) {
            String book = scan.nextLine();

            if (searchingBook.equals(book)) {
                System.out.printf("You checked %d books and found it.", checkedBooks);
                break;
            }
            checkedBooks++;

            if (checkedBooks >= libraryBooks) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", checkedBooks);
                break;
            }
        }
    }
}