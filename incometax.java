import java.util.*;

public class incometax{
  public static void main(String[] args) {
    Scanner inc = new Scanner(System.in);
    int a = inc.nextInt();
    int tax = 0;
    if (a < 50000)
    {
      System.out.println("NO TAX");
    }
    else if (a >= 500000 && a < 1000000)
      {
        tax = (int) (a * 0.2);
      }
     else {
      tax  = (int) (a * 0.3);
     }
     System.out.println("Your tax is : " + tax); 
  }

}
