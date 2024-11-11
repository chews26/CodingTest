import java.util.*;

class Solution {
    public int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i<arr.length; i++){
            if(s.contains(arr[i])){ // s 문자열에 arr[i]가 포함되어 있는지 확인
                s = s.replace(arr[i], Integer.toString(i)); // 만약 포함되어 있다면, 단어를 해당 숫자로 치환
            }
        }
        return Integer.parseInt(s);
    }
}