import java.util.*;
public class A749 {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    List<Integer> list=new ArrayList<Integer>();
    int count=0;
    int n=scan.nextInt();
    if(n%2==1){
      list.add(3);
      n-=3;
    }
    while(n>0){
      list.add(2);
      n-=2;
    }
    System.out.println(list.size());
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }
  } 
}
