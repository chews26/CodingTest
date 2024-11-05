import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int count = 0 ;
        
        for (String idx : str){
            if (idx.contains(" ")){
                count = 0;
            }
            else {
                count++;
            }
            if (count % 2 == 0){
                answer += idx.toLowerCase();
            } else {
                answer += idx.toUpperCase();
            }
        }    
        return answer;
    }
}