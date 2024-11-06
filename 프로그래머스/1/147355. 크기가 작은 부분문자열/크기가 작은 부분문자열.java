class Solution {
    public int solution(String t, String p) {
        int pLen = p.length();
        Long pLong = Long.parseLong(p);
        int answer = 0;
        
        for(int i=0; i<t.length() - pLen + 1; i++){
            String str = t.substring(i, i+pLen);
            
            if (Long.parseLong(str) <= pLong){
                answer++;
            }
        }
               
        return answer;
    }
}