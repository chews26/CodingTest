class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        // A~Z는 65~90 사이
        // a~z는 97~122 사이
        int ascii = 0;
        
        for(int i=0; i<s.length(); i++){
            ascii=s.charAt(i) + n;
            
             if(s.charAt(i) == ' '){
                 answer += s.charAt(i);
             } else if ((s.charAt(i) < 91 && ascii > 90) || ascii > 122){ // 알파벳 범위를 넘어서는 경우를 처리
                ascii -= 26; // 해당 조건에 만족할 경우, ascii에서 26을 빼서 알파벳 범위 내에서 순환
                answer += (char)ascii;
             } else {
                answer += (char)ascii; 
             }
        }
        return answer;
    }
}