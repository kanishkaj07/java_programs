import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = scan.nextInt();
        

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
               System.out.println();
        }
    }
}