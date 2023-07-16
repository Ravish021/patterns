package Pattern;
import java.util.*;
public class inverseRgtriangle {
    public static void main (String[] args){
    Scanner  sc = new Scanner(System.in);

    System.out.print("Enter the value of row : ");
    int row = sc.nextInt();

    System.out.print("Enter the value of column : ");
    int column = sc.nextInt();

    for(int i=1;i<=row;i++){
        for(int j = 1;j<=row-i;j++){
            System.out.print(" ");

        }
        for(int k = 1;k<=column;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    
}
