import java.util.*;
public class maxSubarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println(maxArray(ar));
        sc.close();
    }
    public static int maxArray(int[] nums)
    {
        int max=0;
        int cSum=0;
        for(int i=0;i<nums.length;i++)
        {
            cSum=Math.max(nums[i],cSum+nums[i]);
            if(cSum>max)
            {
                max=cSum;

            }
        }
        if(max==0)
        {
            max=nums[0];
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>max)
                {
                    max=nums[i];
                }
            }
        }
        return max; // change
    }
}
