class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = num;
            
        while (number != 1) {
            if(number % 2 == 0){
                number = number / 2;
                answer++;
            } else if (number % 2 == 1) {
                number = number * 3 + 1;
                answer++;
            } else if (number == 1) {
                answer = 0;
            }
            if(answer >= 500){
                answer = -1;
                break;
            } 
        }
        
        return answer;
    }
}