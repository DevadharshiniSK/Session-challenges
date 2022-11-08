import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[]=new int[n];
          for(int i=0;i<10;i++){
              arr[i]=sc.nextInt();
              if(arr[i]<arr[0]){
                  System.out.println(arr[i]+" ");
              }
          }
    sc.close();
    }
}