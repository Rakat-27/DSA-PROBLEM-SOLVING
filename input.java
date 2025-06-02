
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //nextLine for full sentence and next for a single word
        // String name=sc.nextLine();
        // System.out.println(name);
        // int number=sc.nextInt();
        // System.out.println(number);
        double price=sc.nextDouble();
        System.out.println(price);

        boolean ans=sc.nextBoolean();
        System.out.println(ans);
        boolean ans2=sc.nextBoolean();
        System.out.println(ans2);
        short number=sc.nextShort();
        System.out.println(number);
    }
} 
