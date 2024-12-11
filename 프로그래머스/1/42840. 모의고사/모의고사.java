import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 정답 배열
        int[] score = new int[3];
        
        for (int i=0; i<answers.length; i++){
            if(answers[i] == one[i%one.length]) 
                score [0]++;
            if(answers[i] == two[i%two.length]) 
                score [1]++;
            if(answers[i] == three[i%three.length]) 
                score [2]++;
        }
        
        // 최대 점수 구하기
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        // 최대 점수를 가진 수포자 리스트 생성
        List<Integer> answ = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++) 
            if(max == score[i]) answ.add(i+1);
        
        int[] answer = new int[answ.size()];
        for(int i=0; i<answ.size(); i++){
            answer[i] = answ.get(i);
        }

        return answer;
    }
}