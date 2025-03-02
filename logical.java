import java.util.Scanner;
//import java.lang.*;

public class logical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt();
    
        if(num%3==0&&num%5==0)
        {
           System.out.println("the num is divsible by 3 and 5");

        }
        else
        {
            System.out.println("this is not divisible");
        }
        sc.close();

    }
}