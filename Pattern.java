import java.util.Scanner;
public class Pattern {
    public static void main(SlideProblem[]args)
    {
        Scanner myobj=new Scanner(System.in);
        int rows=myobj.nextInt();
        
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.println(""+i);
            }
            System.out.println("\n");
        }

    }
    
}
