
import java.util.Scanner;
public class MaximumNumber {

    public static void main(SlideProblem[] args) {
        Scanner myObj=new Scanner(System.in);
        
         int a=myObj.nextInt();
         int b=myObj.nextInt();
        
        if(a>b)
        {
            System.out.println("a is maximum");
        }
        else
        {
            System.out.println("b is maximum");
        }
    }
}