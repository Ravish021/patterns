package Pattern;
import java.util.*;
public class numberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row : ");
        int row = sc.nextInt();
        for(int i = 1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                    System.out.print(j);      
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
           
            System.out.println();
        }
    }

}
