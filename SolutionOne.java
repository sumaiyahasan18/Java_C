import java.util.Scanner;
public class SolutionOne {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int letter;
        for(int i=0;i<=num;i++)
        {

           String word=input.nextLine();
           
           letter=word.length();
           if(letter>10)
           {
            word=(word.charAt(0)+Integer.toString(letter-2)+word.charAt(letter-1));
           }
           System.out.println(word);

        }
    }    
}
