import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mark");
        int mark = sc.nextInt();
        if(mark >= 90 && mark <=100)
        {
            System.out.println("A grade");
        }
        else if(mark >= 80 && mark <=89)
        {
            System.out.println("B grade");

        }
        else if(mark >= 70 && mark <=79)
        {
            System.out.println("C grade");
        }
        else if(mark >= 60 && mark <= 69)
        {
            System.out.println("D grade");

        }
        else if(mark < 60)
        {
            System.out.println("fail");

        }
        else
        {
            System.out.println("invalid mark");
        }
        sc.close();

    }
}