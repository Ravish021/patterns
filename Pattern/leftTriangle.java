package Pattern;
import java.util.*;
public class leftTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        for(int i = 1;i<=num_1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
                            System.out.println();

        }
    }
}
