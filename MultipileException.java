import java.util.Scanner;

public class MultipileException {
    public static void main(String[] args) {
        int[] arr = new int[2];
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        try {
            arr[y] = 9 % x;
        } catch (ArithmeticException ArrayIndexOutOfBoundsException) {
            System.out.println("moral");
        }

        // try {

        // arr[3] = 5;
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("sumaiya!");
        // }

    }

}
