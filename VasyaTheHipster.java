import java.util.Scanner;
public class VasyaTheHipster {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int[] nums = new int[2];
    for (int i = 0; i < nums.length; i++) {
        nums[i] = scan.nextInt();
    }
    int red = nums[0];
    int blue = nums[1];
    int diffSocks=0;
    while(red!=0 && blue!=0){
      red--;
      blue--;
      diffSocks++;
    }
    int count=0;
    if(red!=0){
      count=red/2;
    }
    if(blue!=0){
      count=blue/2;
    }
    
     System.out.println(diffSocks+" "+count); 
  } 
}
