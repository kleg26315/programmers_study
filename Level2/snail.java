import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int row,col;
      

      int snail[][]= new int[n][n];
      
      int i = 1;
      int k=0;
      
      for(int count=n; count>0;count-=2){
        for(col=0;col<count;col++){
          snail[k][k+col]=i;
          i++;
        }
        for(row=1;row<count;row++){
          snail[k+row][n-k-1]=i;
          i++;
        }
        for(col=1;col<count;col++){
          snail[k+row-1][n-k-col-1]=i;
          i++;
        }
        for(col=1;col<count-1;col++){
          snail[n-k-col-1][k]=i;
          i++;
        }   
        k++;
      }

      for(row=0;row<n;row++){
        for(col=0;col<n;col++){
          System.out.printf("%d ",snail[row][col]);
        }
        System.out.println();
      }

    }
}
