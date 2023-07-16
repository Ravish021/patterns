package Pattern;
import java.util.*;
public class pyramid_2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of row: ");
    int row = sc.nextInt();
     
     for(int i = 1; i<=row;i++){
     
        // print row-i for space.
        for(int j = 1;j<=row-i;j++){
            System.out.print(" ");
        }
        for(int k = 1;k <= 2*i-1;k++){
            System.out.print("*");

        }
        System.out.println();
        }
        

    
     }

    }
    

