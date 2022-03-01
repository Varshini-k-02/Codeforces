import java.util.Scanner;
public class A_Watermelon{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        if(n==2){
            System.out.println("NO");
            return;
        }
        if(n%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}