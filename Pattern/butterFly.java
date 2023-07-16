package Pattern;
import java.util.*;
public class butterFly {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the value of row : ");
        int row = sc.nextInt();
        
        for (int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*row-(i*2);k++){
                System.out.print(" ");
            }
            // for(int k=1;k<=row-i;k++){
                // System.out.print(" ");
            // }
            for(int k=1;k<=i;k++){
                System.out.print("*");
        }
        System.out.println();
    }
    for (int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             for(int k=1;k<=2*row-(i*2);k++){
                System.out.print(" ");
            }
            // for(int k=1;k<=row-i;k++){
                // System.out.print(" ");
            // }
            for(int k=1;k<=i;k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
