class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        
        // n << t는 n * 2^t 와 동일한 효과
        return n << t ;
    }
}