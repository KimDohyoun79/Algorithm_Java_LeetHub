class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0]; // 가격이 작은 수를 저장하는 변수
        int profit = 0; // 결과값 변수
        
        for(int i = 1; i < prices.length; i++){
            if(min > prices[i]) // 현재 가격보다 작으면
                min = prices[i]; // 작은 가격 저장
            else{
                profit += prices[i] - min; // 아니면 현재 가격 - 이전 가격
                min = i < prices.length - 1 ? prices[i] : 0; // 수익 연산 후 min 초기화, indexoverflow 방지 
            }
        }
        return profit;
    }
}