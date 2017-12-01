package library;

public class MainMenu {

    public static void menu(final Storage storage) {
        // write menu
        System.out.println("Benvenuto! \n ");
        System.out.println("Scegli il numero:");
        System.out.println("1 Read Menu");
        System.out.println("2 Create Menu");
        System.out.println("3 Delete Menu");
        System.out.println("4 Quit");
        String scelta = Utility.readln();

        while (!"4".equals(scelta)) {

            if ("1".equals(scelta)) {
                ReadMenu.menu(storage);
                System.out.println("Fatto!");
            } else if ("2".equals(scelta)) {
                CreateMenu.menu(storage);
                System.out.println("Fatto!");

            } else if ("3".equals(scelta)) {
                DeleteMenu.menu(storage);
                System.out.println("Fatto!");
            }
            System.out.println("Scegli di nuovo il numero");
            System.out.println("1 Read Menu");
            System.out.println("2 Create Menu");
            System.out.println("3 Delete Menu");
            System.out.println("4 Quit");
            scelta = Utility.readln();
        }
        System.out.println("Arrivederci!");
    }   // read user input
    // call functions
    // loop
}
