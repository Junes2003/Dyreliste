import java.util.ArrayList;
import java.util.Scanner;

public class GætEtHemmeligtOrd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> hemmeligeOrd = new ArrayList<>();

        // Tilføjer de hemmelige ord
        hemmeligeOrd.add("hey");
        hemmeligeOrd.add("prut");
        hemmeligeOrd.add("tid");

        System.out.println("Nu skal du gætte et af de hemmelige ord!");

        while (true) {
            System.out.print("Indtast dit gæt: ");
            String gæt = scanner.nextLine().toLowerCase();

            if (hemmeligeOrd.contains(gæt)) {
                System.out.println("Du gættede rigtigt, min bror!");
                break;
            } else {
                System.out.println("Argh, ikke helt min ven...");
                System.out.println("Prøv igen:");
            }
        }

        scanner.close();
    }
}