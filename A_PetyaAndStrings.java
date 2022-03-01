import java.util.Scanner;
public class A_PetyaAndStrings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        String first = a.toLowerCase();
        String second = b.toLowerCase();
    
       
        if(first.compareTo(second) ==0){
            System.out.println("0");
        }
        if(first.compareTo(second) > 0){
            System.out.println("1");
        }
        if(first.compareTo(second) < 0){
            System.out.println("-1"); 
    }
}
}
