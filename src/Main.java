import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben um ein Tier auszuwählen:");
        System.out.println("(1=Katze) (2=Hund) (3=Kuh) (4=Fisch) (5=Schwein)");
        int tiernummer = scanner.nextInt();
        System.out.println("Wie soll das Tier heißen?");
        String name = scanner.next();

        switch (tiernummer){
            case 1: Katze katze = new Katze(name);
            katze.gibLaut();
            break;
            case 2: Hund hund = new Hund(name);
            hund.gibLaut();
            break;
            case 3: Kuh kuh = new Kuh(name);
            kuh.gibLaut();
            break;
            case 4: Fisch fisch = new Fisch(name);
            fisch.gibLaut();
            break;
            case 5: Schwein schwein = new Schwein(name);
            schwein.gibLaut();
            break;
            default: System.out.println("Abbruch: Keine gültige Tierklasse für "+name+" ausgewählt.");
        }
    }
}