import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int unosKorisnika = Integer.parseInt(scanner.nextLine());

        boolean paran = unosKorisnika % 2 == 0;
        String poruka;
        if (paran) {
            poruka = "paran";
        } else {
            poruka = "neparan";
        }

        System.out.print("Uneli ste broj: " + unosKorisnika + "i on je " + poruka);


    }
}
