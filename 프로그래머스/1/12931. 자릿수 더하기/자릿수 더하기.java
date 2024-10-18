import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n>0) {
            answer += n%10; // 나머지 값 구하기
            n = n /10; // 나눈 값 다시 n에 대입하기
        } 

        return answer;
    }
}