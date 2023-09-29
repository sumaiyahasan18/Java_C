import java.util.Scanner;
import java.util.ArrayList;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Rectangle> rectangle = new ArrayList<Rectangle>();
        Rectangle r1 = new Rectangle((scanner.nextInt()), scanner.nextInt());
        Rectangle r2 = new Rectangle((scanner.nextInt()), scanner.nextInt());
        Rectangle r3 = new Rectangle((scanner.nextInt()), scanner.nextInt());
        rectangle.add(r1);
        rectangle.add(r2);
        rectangle.add(r3);
        for (int i = 0; i <= rectangle.size(); i++) {
            System.out.println(rectangle.get(i).CalculateArea());
        }
    }

}

class Rectangle {
    int height;
    int width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int CalculateArea() {
        int totalArea = height * width;
        return totalArea;
    }
}
