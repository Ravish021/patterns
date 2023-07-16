package Pattern;
import java.util.Scanner;
public class Pyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of rows: ");
        int row_1 = sc.nextInt();
        for(int i=1; i<=row_1;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row_1-1; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
    }
}
}
