class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int countZero = 0;

        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                countZero++;
                continue;
            }
            for(int j=0; j<win_nums.length; j++){
                if(win_nums[j] == lottos[i]){
                    count++;
                    continue;
                }
            }
        }
        answer[0] = 7 - (count + countZero);
        answer[1] = 7 - count;
        if(answer[0] > 6) answer [0] = 6;
        if(answer[1] > 6) answer [1] = 6;
        
        return answer;
    }
}