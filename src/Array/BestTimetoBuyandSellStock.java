package Array;
public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        if (prices.length<2 || prices==null){
            return 0;
        }
        int minvalue=Integer. MAX_VALUE;
        int maxprofit=0;

        for (int i=0;i<prices.length;i++){
            if (prices[i]<minvalue){
                minvalue=prices[i];
            }else if(prices[i]-minvalue>maxprofit){
                maxprofit=prices[i]-minvalue;
            }
        }
        return maxprofit;
    }
}
