import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for (int i=0; i<numbers.length; i++){
            for (int j= i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                set.add(sum);
                }
            }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}