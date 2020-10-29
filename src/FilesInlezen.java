import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen {
    public static void main(String[] args) {

        File f = new File("Hello2.txt");

        try {
            Scanner s = new Scanner(f);
            while (s.hasNextLine())
                System.out.println(s.nextLine());
        } catch (FileNotFoundException a) {
            System.out.println("Het bestand met de naam: "+f+" Is niet gevonden");
        } finally {
            System.out.println("Tot ziens!");
        }
    }
}

