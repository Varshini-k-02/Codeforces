import java.util.*;
import java.lang.*;
public class A1335 {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    int x=0;
    for(int i=0;i<n;i++){
      x=scan.nextInt();
      if(x>2){
        func(x);
      }
      else{
        System.out.println(0);
      }
      
    }
  } 
 
static void func(int n){
    long x=(int)Math.ceil((n-1)/2);
    System.out.println(x);
  }
}
