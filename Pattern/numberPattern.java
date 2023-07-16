package Pattern;
import java.util.*;
public class numberPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the value of number: ");
        int num_1 = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j =1;j<=num_1;j++){
                if (i==1||i==row||j==1||j==num_1){
                    System.out.print(j);
                }
                else
                System.out.print(" ");

            }
            System.out.println();
        }

    }
    
}
