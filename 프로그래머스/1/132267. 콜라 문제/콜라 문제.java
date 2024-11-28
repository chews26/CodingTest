class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int count = 0;
        int result = 0;
        
        while(n >= a){
            count = n / a * b;
            result = n % a;
            n = count + result;
            answer += count;
        }
        
        return answer;
    }
}