import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");;
        int b=sc.nextInt();
        a+=b;
        System.out.println("total ="+a);
        
        System.out.println("enter c");
        int c=sc.nextInt();
        System.out.println("enter d");
        int d=sc.nextInt();
        c-=d;
        System.out.println("sub"+c);
        d*=c;
        System.out.println("mul"+d);
        System.out.println("enter e");
        int e=sc.nextInt();
        System.out.println("enter f");
        int f=sc.nextInt();
        e/=f;
        System.out.println("div="+e);
        f%=e;
        System.out.println("mod="+f);
        sc.close();

        
    }
}