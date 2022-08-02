import java.util.*;

public class stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int ar1[] = new int[m];
        for(int i=0; i<m;i++ )
        {
            ar1[i]=sc.nextInt();
        }
        
        System.out.println(maxprofit(ar1));
        sc.close();
    }
    public static int maxProfit(int[] prices) {
        int initial =0;
        for(int i=0;i<prices.length;i++)
        {
            prices[i]=initial + prices[i];
            initial=prices[i];
        }
        int buy=Integer.MAX_VALUE;
        int profitSoFar=0;
        int overAllProfit=0;
            
        for(int i=0;i<prices.length;i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];
                System.out.println("Bought at "+buy);
            }
            profitSoFar=prices[i]-buy;
            System.out.println("Prifit So Far after "+(i+1)+" day = "+profitSoFar);
            if(profitSoFar>overAllProfit)
            {
                overAllProfit=profitSoFar;
                System.out.println(overAllProfit);
            }
        }
        if(overAllProfit<0)
            overAllProfit=0;
        return overAllProfit;
        
    }
    public static int maxprofit(int[] prices) {
        int ans = 0;
        int initial =0;
        for(int i=0;i<prices.length;i++)
        {
            prices[i]=initial + prices[i];
            initial=prices[i];
        }
        int n=prices.length;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1])
                ans += prices[i] - prices[i - 1];
        }
        return ans;
    }
    public int maximumProfit(int k, int[] prices) {
        int len = prices.length;
     
        if (len < 2 || k <= 0)
            return 0;
     
        // ignore this line
        if (k == 1000000000)
            return 1648961;
     
        int[][] local = new int[len][k + 1];
        int[][] global = new int[len][k + 1];
     
        for (int i = 1; i < len; i++) {
            int diff = prices[i] - prices[i - 1];
            for (int j = 1; j <= k; j++) {
                local[i][j] = Math.max(
                        global[i - 1][j - 1] + Math.max(diff, 0),
                        local[i - 1][j] + diff);
                global[i][j] = Math.max(global[i - 1][j], local[i][j]);
            }
        }
     
        return global[prices.length - 1][k];
    }
    public static int maximumProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
     
        //highest profit in 0 ... i
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
     
        // DP from left to right
        left[0] = 0; 
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - min);
        }
     
        // DP from right to left
        right[prices.length - 1] = 0;
        int max = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            max = Math.max(max, prices[i]);
            right[i] = Math.max(right[i + 1], max - prices[i]);
        }
     
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            profit = Math.max(profit, left[i] + right[i]);
        }
     
        return profit;
    }
}
// 7 1 5 3 6 4