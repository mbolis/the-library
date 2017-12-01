package library;

import java.util.*;
public class MainMenu {

    static String readln() {
        return new java.util.Scanner(System.in).nextLine();

    }

    public static void menu(final Storage storage) {
        Scanner in = new Scanner(System.in);
        // write menu
        System.out.println("Benvenuto! \n ");
        System.out.println("Scegli il numero:");
        System.out.println("1 Read Menu");
        System.out.println("2 Create Menu");
        System.out.println("3 Delete Menu");
        System.out.println("4 Quit");
        String scelta = readln();
        
        while (!"4".equals(scelta)) {
            

            if ("1".equals(scelta)) {
                ReadMenu.menu(storage);
                System.out.println("Fatto!");
            } else if ("2".equals(scelta)) {
                CreateMenu.menu(storage);
                System.out.println("Fatto!");
                
            } else if ("3".equals(scelta)) {
                        CreateMenu.menu(storage);
                        System.out.println("Fatto!");
            }
            System.out.println("Scegli di nuovo il numero");
            System.out.println("1 Read Menu");
            System.out.println("2 Create Menu");
            System.out.println("3 Delete Menu");
            System.out.println("4 Quit");
            scelta = readln();
        }
        System.out.println("Arrivederci!");
    }   // read user input
        // call functions
        // loop
}

