import java.util.ArrayList;
import java.util.Scanner;

public class SlideSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        Rectangle r1 = new Rectangle(
                scanner.nextInt(), scanner.nextInt());
        Rectangle r2 = new Rectangle(
                scanner.nextInt(), scanner.nextInt());

        rectangles.add(r1);
        rectangles.add(r2);
        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i).calculateArea());
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

    public int calculateArea() {
        int area = height * width;
        return area;
    }

    // public String toString() {
    // return calculateArea() + " ";
    // }
}
