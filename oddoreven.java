import java.util.*;
public class oddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 2;
        if(a%c == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    
    }
}