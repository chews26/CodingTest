class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 계산
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int max = 1;
        
        // 최대공약수 구하기
        for(int i=1; i<=numer && i<=denom; i++) {
            if(numer%i == 0 && denom%i == 0) {
                max = i;
            }
        }

        // 최대공약수로 나누기
        numer = numer/max;
        denom = denom/max;
        
        //배열에 넣기
        int[] answer = {numer, denom};
            
        return answer;
    }
}