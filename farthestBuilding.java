import java.util.Scanner;

class farthestBuilding
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int bricks=sc.nextInt();
        int ladders=sc.nextInt();
        System.out.println(furthestBuilding(ar, bricks, ladders));
        sc.close();
    }
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int bricksLeft=bricks;
        int laddersLeft=ladders;
        int i=0;
        for(i=0;i<heights.length-1;i++)
        {
            if(heights[i+1]>heights[i])
            {
                if(bricksLeft>=(heights[i+1]-heights[i]))
                {
                    bricksLeft-=heights[i+1]-heights[i];
                }
                else if(laddersLeft!=0)
                {
                    laddersLeft--;
                }
                else
                {
                    return i;
                }
            }
        }
        
        return i;
    }
}