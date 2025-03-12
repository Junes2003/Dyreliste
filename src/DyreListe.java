import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DyreListe {
    public static void main(String[] args) {
        ArrayList<String> dyreListe = new ArrayList<>();

        dyreListe.add("Kat");
        dyreListe.add("Hund");
        dyreListe.add("Løve");

        System.out.println("Det her er mine 3 yndlingsdyr " + dyreListe);

        dyreListe.add("Panda");
        System.out.println("Her er mine 4 yndlingsdyr " + dyreListe);

        dyreListe.remove(1);
        System.out.println("Her har jeg fjernet et dyr fra listen " + dyreListe);

        System.out.println("Vælg dit yndlingsdyr?");
        Scanner scanner = new Scanner(System.in);
        String nytDyr = scanner.nextLine();
        dyreListe.add(nytDyr);

        System.out.println("Liste efter brugerinput: " + dyreListe);

        Collections.sort(dyreListe);
        System.out.println("Her er listen i alfabetisk rækkefølge" + dyreListe);

        scanner.close();
    }
}