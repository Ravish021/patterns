package Pattern;
import java.util.Scanner; 

public class rectangulerGap {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows : ");
        int row_1 = sc. nextInt();
        System.out.println("Enter the value of column : ");
        int column_1 =sc. nextInt();

        for(int i = 1;i <= row_1;i++){
            for (int j = 1;j <=column_1;j++){
                if(i==1||i==row_1||j==1||j==column_1){
                    System.out.print("*");
                }
                else
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}