import java.util.Scanner;
public class arithmetic{



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a= sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        int c =a+b;
        int d = a-b;
        int e = a*b;
        int f= a/b;
        System.out.println("sum ="+c);
        System.out.println("sub="+d);
        System.out.println("mul="+e);
        System.out.println("div="+f);
        sc.close();

    }
}