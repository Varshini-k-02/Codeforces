import java.util.Scanner;
public class A_Hulk {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        String single="I hate it";
        String hate="I hate ";
        String that="that ";
        String love="I love ";
        boolean flag=true;
        String ans="";
        if(n==1){
            ans=hate;
        }
        else{
        for(int i=0;i<n;i++){
            if(flag==true && i!=n-1){
                ans+=hate + that;
            }
            else if(flag==true && i==n-1){
                ans+=hate;
            }
            else if(flag==false && i!=n-1){
                ans+=love + that;
            }
            else if(flag==false && i==n-1){
                ans+=love;
            }
            flag=!flag;
        }
        }
        ans+="it";
        System.out.println(ans);
  } 
}
