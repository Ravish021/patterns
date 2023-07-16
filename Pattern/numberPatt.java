package Pattern;
import java.util.*;
public class numberPatt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for (int j = 0;j <= row-i;j++){
                System.out.print(" ");
            }
            for(int k = i;k>=1;k--){
                System.out.print(k);
            }
            for (int j = 2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
