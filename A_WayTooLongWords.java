import java.util.Scanner;
public class A_WayTooLongWords{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
        while(n>0){
            String s=scan.next();
            int len=s.length();
            if(len<=10){
                System.out.println(s);
            }
            else{
                String ans="";
                char[] ch=new char[len];
                for(int i=0;i<len;i++){
                    ch[i]=s.charAt(i);
                }
                char part1=ch[0];
                int between=0;
                for(int j=1;j<len-1;j++){
                    between++;
                }
                char part2=ch[len-1];
                String bet=Integer.toString(between);
                ans=ans+part1;
                ans=ans+bet;
                ans=ans+part2;
                System.out.println(ans);
            }
            
            n--;
        }
    }
}