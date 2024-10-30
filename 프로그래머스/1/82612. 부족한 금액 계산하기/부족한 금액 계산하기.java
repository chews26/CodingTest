class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long much = 0;
        
        for (int i=1; i<=count; i++){
            much += (long)price * i;
        }
        
        answer = money - much;
        
        if(answer < 0){
            answer = -answer;
            return answer;
        } else {
            return 0;
        }
    }
}