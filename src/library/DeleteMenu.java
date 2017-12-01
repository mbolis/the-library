package library;

public class DeleteMenu {
         static String readln(){
         return new java.util.Scanner(System.in).nextLine();
         }
         
         
    public static void menu(final Storage storage) {
        String input, check;
        
        System.out.println("Type Isbn Please?");
        input = readln();
        
        
        
        boolean var  =  storage.delete(input);
        
        if (var)
        
        System.out.println("Book Deleted Sucessfully!");
        
        else
            
            
        System.out.println("Sorry!, Book not found");
       
    }
}
