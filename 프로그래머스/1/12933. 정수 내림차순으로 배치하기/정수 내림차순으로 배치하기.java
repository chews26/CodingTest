import java.util.*;

class Solution {
    public long solution(long n) {
        char[] number = String.valueOf(n).toCharArray();
        
        Arrays.sort(number);
        
        StringBuilder rev = new StringBuilder(new String(number)).reverse();
        
        
        return Long.parseLong(rev.toString());
    }
}