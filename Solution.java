import java.util.Scanner;
public class Solution {
    public static void main (SlideProblem[]args) {

    PrintResult obj1=new PrintResult();
    int result=obj1.GetResult();
    if(result==1)
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }
}
    
}
 class PrintResult{
    
    public int GetResult(){
        int n;
        int x,y,z;
        int sumX=0;
        int sumY=0;
        int sumZ=0;
        Scanner myobj=new Scanner(System.in);
        n=myobj.nextInt();
        for(int i=1;i<=n;i++)
        {
           
            x=myobj.nextInt();
            y=myobj.nextInt();
            z=myobj.nextInt();
            for(int j=1;j<=n;j++)
            {
                sumX=sumX+x;
                sumY=sumY+y;
                sumZ=sumZ+z;
            }
        }
        if(sumX==0 && sumY==0 && sumZ==0)
        {
            return 1;
        }
        return 0;


    }
}

