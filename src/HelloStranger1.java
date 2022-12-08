import java.util.Scanner;

public class HelloStranger1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
