import java.util.*;
public class twoSums {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(Arrays.toString(twoSum(ar, target)));
        sc.close();
    }
    public static int[] twoSum(int[] nums, int target)
    {
        int ar[]=new int[2];
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],i);
            }
            
        }
        for(int i=0;i<nums.length;i++)
        {
            int n=target-nums[i];
            if(hm.containsKey(n))
            {
                ar[1]=i;
                ar[0]=hm.get(n).intValue();
            }
            if(ar[0]!=ar[1])
            {
                break;
            }
        }
        return ar;
    }
}
