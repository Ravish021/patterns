package Pattern;
import java.util.*;

public class pyramidGap {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
   //  int column = sc.nextInt();

    for (int i=1;i<=row;i++){
      for (int j=1;j<=row-i;j++){
         
         System.out.print(" ");
      }
      for (int k=1;k<=2*i-1;k++){
         if(i==1||i==row||k==2*i-1||k==1) 
         System.out.print("*");
         else
         System.out.print(" ");
          
      }
      System.out.println();
    }
   
    
   } 
}
