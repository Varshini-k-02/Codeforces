
import java.util.*;
public class 723A {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int[] nums = new int[3];
    for (int i = 0; i < nums.length; i++) {
        nums[i] = scan.nextInt();
    }
    Arrays.sort(nums);
    int mid=nums[1];
    int x=nums[0];
    int y=nums[2];
    int answer=y-mid+mid-x;
    System.out.println(answer);
  } 
}
