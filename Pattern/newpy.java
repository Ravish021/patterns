package Pattern;
import java.util.*;
public class newpy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i=0;i <= row-1;i++){
            for (int j=row-i;j>=1;j--){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}
