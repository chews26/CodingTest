import java.util.*;

class Solution {
    public int solution(int[] array) {
                
        // 정렬하는 명령어
        // Arrays.sort()
        Arrays.sort(array);
        
        // 배열의 길이 구하는 명령어
        // array.length
        int answer = array[array.length/2];
      
        
        return answer;
    }
}