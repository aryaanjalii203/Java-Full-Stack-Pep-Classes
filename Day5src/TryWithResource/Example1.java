package TryWithResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("C:\\Users\\Dell\\eclipse-workspace\\Day5\\src\\Exceptions\\test2.txt"))) {
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
