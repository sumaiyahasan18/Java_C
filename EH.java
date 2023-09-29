import java.util.Scanner;

public class EH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] nums = new int[10];
        try {
            int y = 5 / x;
            System.out.println(y);
        } catch (ArithmeticException e) {
            System.out.println("mara!");
        }
        try {
            int z = scanner.nextInt();
            nums[z] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("sumaiya!");
        }

        scanner.close();
    }
}
