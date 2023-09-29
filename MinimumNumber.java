
import java.util.Scanner;
public class MinimumNumber {
 
    
    public static void main(SlideProblem[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=myobj.nextInt();
        
         System.out.println("Enter the value of y:");
        int y=myobj.nextInt();
        
         System.out.println("Enter the value of z:");
        int z=myobj.nextInt();
        if(x<y && x<z)

        {
            System.out.println("x is minimum");
        }
        else if(y<x && y<z)
        {
            
            System.out.println("y is minimum");
        }
        else
        {
            
            System.out.println("z is minimum");
        }
        
    }
}

