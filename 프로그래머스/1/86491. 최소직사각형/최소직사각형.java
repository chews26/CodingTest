class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxresult = 0;
        int minresult  = 0;
        
        
        for(int i=0; i<sizes.length; i++){
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            maxresult = Math.max(maxresult, max);
            minresult = Math.max(minresult, min);
        }
        
        answer = maxresult * minresult;
        
        return answer;
    }
}