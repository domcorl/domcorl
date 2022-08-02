import java.util.*;

public class pascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(generate(m));
        sc.close();
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<i;j++)
            {
                if(j==0 || j==i-1)
                {
                    row.add(1);
                }
                else
                {
                    int temp = ls.get(i-2).get(j-1).intValue()+ls.get(i-2).get(j).intValue();
                    row.add(temp);
                }
            }
            ls.add(row);
        }
        return ls;
        
    }
}
