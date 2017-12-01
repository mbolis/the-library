package library;

public class DeleteMenu {
        static String readln() {
        return new java.util.Scanner(System.in).nextLine();
        }

    public static void menu(final Storage storage) {
        // ask for isbn
        // delete from storage
      
        System.out.println("please type the ISBN of the book to delete?");
        String input = readln();
        //storage.delete(input);
        
        boolean result = storage.delete(input);
        if (result)
        System.out.println("Book deleted");
        else 
            System.out.println("Book not found");
    }
}
