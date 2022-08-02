import java.util.Arrays;
import java.util.Scanner;

public class runningSumArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(ar)));
        sc.close();
    }
    public static int[] runningSum(int[] nums) {
        
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        
        return nums;
        
    }
}
