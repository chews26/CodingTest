import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1; // 시작 인덱스 (0부터 시작하게 조정)
            int end = commands[i][1];       // 끝 인덱스 (범위에 포함되어야 하므로 그대로 사용)
            int k = commands[i][2] - 1;     // k번째 값 (0부터 시작하게 조정)
            
            // 배열의 일부분을 복사하여 정렬
            int[] temp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(temp);
            
            // k번째 값을 정답 배열에 저장
            answer[i] = temp[k];
        }
        
        return answer;
    }
}