public class buy{
    public static void main(String[] args){
        buy b = new buy();
        int[] prices = {7,1,5,3,6,4};
        int result = b.buySell(prices);
        System.out.println(result);
    }
    public int buySell(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}