import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[]=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
          }
          int num = sc.nextInt();
          for(int i=0;i<n;i++){
            for(int j=i+1;j<n;i++){
                if(arr[i]+arr[j]==num)
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
          }
          sc.close();
        }
    }         
