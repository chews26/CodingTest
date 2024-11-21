class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
         answer[0] = -1;
        
        for(int i=0; i<s.length(); i++){
            // i와 같은 값이 있는지 i보다 앞 배열을 역순으로 검사
            for (int j=i-1; j>=0; j--){
                if(s.charAt(i)== s.charAt(j)){
                    answer[i] = i-j;
                    break;
                }
            }
            if(answer[i] == 0)
                answer[i] = -1;
        }
        return answer;
    }
}