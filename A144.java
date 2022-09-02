import java.util.*;
public class A144 {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = scan.nextInt();
    }
    //Greater num 
    int max=arr[0];
    int largePos=0;
    for(int j= 0; j < n; j++){
      if(arr[j]>max){
        max=arr[j];
        largePos=j;
      }
    }
    
    int min=101;
    int smallPos=0;
    for(int j= 0; j < n; j++){
      if(arr[j]<=min){
        min=arr[j];
        smallPos=j;
      }
    }
    
    
    if(largePos>smallPos){
      smallPos=smallPos+1;
    }
    int sd=n-1-smallPos;
    int tot=sd+largePos;
    System.out.println(tot);
  } 
}
