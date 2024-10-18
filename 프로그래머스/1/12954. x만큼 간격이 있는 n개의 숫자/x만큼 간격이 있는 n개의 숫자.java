class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // long타입의 배열 생성
        answer[0] = x; // long의 0번째 인덱스는 x
        
        for(int i=1; i<n; i++) {
            answer[i] = answer[i - 1] + x; // 이전 배열 값에 x를 더하기
        }
        
        return answer;
    }
}