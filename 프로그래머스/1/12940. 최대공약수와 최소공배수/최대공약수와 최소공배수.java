import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        while(min !=0){
            int result = max % min;
            max = min;
            min = result;
        }
        
         return new int[] { max, n * m / max };
    }
}