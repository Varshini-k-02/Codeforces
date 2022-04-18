import java.util.Scanner;
public class StonesOnTable {  
  public static void main(String args[]) { 
    int count=0,i=0;
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    String s = scan.next();
    for(int j=0;j<n;j++){
      char ch=s.charAt(i);
      i=j+1;
      if(i<n && s.charAt(j)==s.charAt(i)){
        count++;
      }
    }
     System.out.println(count); 
  } 
}
