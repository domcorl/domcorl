import java.util.Scanner;

public class pivotIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println(pivotIndexs(ar));
        sc.close();
    }
    public static int pivotIndexs(int[] nums) 
    {
        int leftSum=0,rightSum=0, pivotIndex=-1;
        for(int i=nums.length-1;i>0;i--)
        {
            rightSum+=nums[i];
        }
        if(rightSum==0)
        {
            pivotIndex=0;
            return pivotIndex;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            rightSum-=nums[i+1];
            leftSum+=nums[i];
            if(leftSum==rightSum)
            {
                pivotIndex=i+1;
                return pivotIndex;
            }
        }
        return pivotIndex;
    }
}
// 0 1 2 3 4 5 6 7 8 9