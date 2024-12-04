class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int cardIndex1 = 0;
        int cardIndex2 = 0;
        
        for(int i=0; i<goal.length; i++){
            if (cardIndex1 < cards1.length && goal[i].equals(cards1[cardIndex1])) {
                cardIndex1++;
                continue;
            }
            if (cardIndex2 < cards2.length && goal[i].equals(cards2[cardIndex2])) {
                cardIndex2++;
                continue;
            }
            answer = "No";
            return answer;
        }
            
            
        return answer;
    }
}