import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no of columns: ");
       int m = sc.nextInt();
       System.out.println("Enter no of rows: ");
       int n = sc.nextInt();
       int arr[][]=new int[m][n];
       for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
             arr[i][j]=sc.nextInt();
         }
       }
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
           System.out.println(arr[i][j] + " ");
       }
       System.out.println();
     }
     sc.close();
    }
}