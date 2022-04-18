import java.util.Scanner;
public class SoldierAndBananas {  
  public static void main(String args[]) { 
    int count=0,ans=0;
    Scanner scan = new Scanner(System.in);
    int[] nums = new int[3];
    for (int i = 0; i < nums.length; i++) {
        nums[i] = scan.nextInt();
    }
    int n = nums[2];
    int bPrice=nums[0];
    int price[]=new int[n];
    int totalPrice=0;
    for(int j=1;j<=n;j++){
      price[j-1]=j*bPrice;
      totalPrice += price[j-1];
    }
    if(totalPrice<=nums[1]){
      ans=0
    }
    else{
      ans = totalPrice - nums[1];
    }
    
     System.out.println(ans); 
  } 
}
