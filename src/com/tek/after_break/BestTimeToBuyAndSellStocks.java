package com.tek.after_break;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result=bestTime(prices);
        System.out.println(result);
    }
    public static int bestTime(int[] arr){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:arr){
            if(minPrice>price){
                minPrice=price;
            }else {
                maxProfit=Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }
}

