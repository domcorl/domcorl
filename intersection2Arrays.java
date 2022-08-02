// #350
import java.util.*;

public class intersection2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int ar1[] = new int[m];
        for(int i=0; i<m;i++ )
        {
            ar1[i]=sc.nextInt();
        }
        int n = sc.nextInt();
        
        int ar2[] = new int[n];
        for(int i=0; i<n;i++ )
        {
            ar2[i]=sc.nextInt();
        }
        
        System.out.println(Arrays.toString(intersection(ar1, ar2)));
        sc.close();
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        List<Integer> ls=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            hs.put(nums1[i],hs.getOrDefault(nums1[i], 0) + 1);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(hs.containsKey(nums2[i]) && hs.get(nums2[i])>0)
            {
                
                ls.add(nums2[i]);
                hs.put(nums2[i],hs.getOrDefault(nums2[i], 0)-1);
            }
        }
        int ar[]=ls.stream().mapToInt(Integer::intValue).toArray();
        return ar;
        
    }
}
