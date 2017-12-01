package library;

public class DeleteMenu {

    public static void menu(final Storage storage) {
        System.out.println("please type the ISBN of the book to delete?");
        String input = Utility.readln();
        //storage.delete(input);

        boolean result = storage.delete(input);
        if (result) {
            System.out.println("Book deleted");
        } else {
            System.out.println("Book not found");
        }
    }
}
