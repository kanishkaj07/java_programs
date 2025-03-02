import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        int result1=a&b;
        System.out.println(result1);
        System.out.println("enter c");
        int c = sc.nextInt();
        System.out.println("enter d");
        int d = sc.nextInt();
        int result2 = a|b;
        System.out.println(result2);
        int result3 = c^d;
        System.out.println(result3);
        sc.close();
        

    }
}