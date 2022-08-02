import java.util.*;
public class HouseAndRobber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        HouseAndRobber ob= new HouseAndRobber();
        
        System.out.println(ob.rob(ar));
        sc.close();
    }
    int sum=0;
    public int rob(int[] nums) {
        return -1;
    }
}
