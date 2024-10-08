import java.util.Arrays;
public class HouseRobber 
{
     public static int at(int[] n,int i,int[] dp)
    {
        if(i>=n.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=n[i]+at(n,i+2,dp);
        int skip=at(n,i+1,dp);
        return dp[i]=Math.max(take,skip);
    }
    public static int rob(int[] nums)
    {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return at(nums,0,dp);

        
    }
    public static void main(String[] args) 
    {
        
       int[] v={2,7,9,3,1} ;
       int re=HouseRobber.rob(v);
       System.out.println("The profit is: "+re);
    }
}
