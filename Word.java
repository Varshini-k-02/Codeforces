import java.util.Scanner;
public class Word {  
  public static void main(String args[]) { 
    int upper=0,lower=0;
    String ans="";
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(Character.isUpperCase(ch)){
        upper++;
      }
      else{
        lower++;
      }
    }
    if(upper-lower>0){
      ans=s.toUpperCase();
    }
    else{
      ans=s.toLowerCase();
    }
     System.out.println(ans); 
  } 
}
