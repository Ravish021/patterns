package Pattern;
import java.util.Scanner;
public class rectangulerPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // take input of rows and column.
        System.out.println("enter the value of rows : ");
        int row_1 = sc.nextInt();
         System.out.println("enter the value of column : ");
        int column_1 = sc.nextInt();

        for(int i=1;i<=row_1;i++){
            for(int j=1;j<=column_1;j++){
                System.out.print("*");            
            }
            System.out.println(" ");

        }

    }
}
