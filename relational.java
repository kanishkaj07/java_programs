import java.util.Scanner;

public class relational {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("entre b");
        int b=sc.nextInt();
        //to find greatest or equal
        if (a==b) 
        {
            System.out.println("both are equal");

            
        }
        else if (a>b) {

          System.out.println("a is greatest");

        }
        else{
        System.out.println("b is greatest");
        }
        sc.close();

     }
}