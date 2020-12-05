//put imports you need here
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next(); // "This"

        String age = scanner.next(); // " is a simple"

        String edu = scanner.next(); // "multiline"

        String tec = scanner.next(); // "input,"

        String kon = scanner.next(); // ""

        System.out.println("The form for " +name+ " is completed. We will contact you if we need a chef that cooks "+kon+" dishes.");

    }
}