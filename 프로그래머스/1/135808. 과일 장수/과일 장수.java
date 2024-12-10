import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for (int i = score.length; i >= m; i -= m){
            // i-m 위치의 점수가 가장 작은 점수
            answer += score[i - m] * m;

        }
        
        return answer;
    }
}