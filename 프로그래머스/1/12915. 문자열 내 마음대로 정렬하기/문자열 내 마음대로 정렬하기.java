import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<strings.length; i++){
            // n번째 인덱스 값을 가장 앞에 추가
            list.add(strings[i].charAt(n) + strings[i]);
        }
        // 정렬
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++){
            // 가장 앞에 추가된 값을 삭제하고 결과값에 저장
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}