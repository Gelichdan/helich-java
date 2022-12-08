import java.util.Scanner;

public class FindElementInArray3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        returnDivided(array);

    }

    public static void returnDivided(int[] array) {



        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) System.out.print(array[i] + " ");

        }
    }
}
