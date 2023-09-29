public class FibonacciNumber{
    public static void main(SlideProblem[]args)
    {
      FibonacciPrinter myobj=new FibonacciPrinter();
      myobj.Printfibonacci(5);
    }
}
class FibonacciPrinter{
    int length;
    public void Printfibonacci(int x)
    {
     length=x;
    int num1=0;
    int num2=1;
    System.out.println(num1);
    System.out.println(num2);
    for(int i=2;i<=x;i++)
    {
    int finalNum=num1+num2;
    System.out.println(finalNum);
    num1=num2;
    num2=finalNum;
    }
    
    }
}