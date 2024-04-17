import java.util.*;

public class bill{
    public static void main(String args[]){
        Scanner bill = new Scanner(System.in);
        System.out.print("cost of pencil = ");
        float a = bill.nextFloat();
        System.out.print("cost of pen = ");
        float b = bill.nextFloat();
        System.out.print("cost of eraser = ");
        float c = bill.nextFloat();
         float sum = a + b + c;
         System.out.println("you total is :" + sum);
         float tax = (0.18f * sum);
         System.out.println("Your tax is :" + tax);
         float total = tax + sum;
         System.out.println("Your bill after tax is :" + total);
    }
}
