import java.util.Scanner;
public class ife{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter  num");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("the given number is positive");

        }
        else if(num<0)
        {
            System.out.println("the given number is negative");


        }
        else
        {
            System.out.println(" number is 0");
        }
        sc.close();








    }
}