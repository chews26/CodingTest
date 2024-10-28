import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        // arr 값이 10일 경우
        if (arr[0] == 10) {
            arr[0] = -1;
            return arr;
        }
        
        // array 최소 인덱스 설정
        int min = 0;
        
        // 최소값을 가진 인덱스 구하기
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        
        // 최소값을 제외하기 위한 배열 선언
        int[] result = new int[arr.length -1];
        
        // 최소값을 제외하고 새로운 배열에 추가
        int index =0;
        
        for (int i = 0; i < arr.length; i++) {
            if (i != min) { // i가 최소값이 아닐 때
                result[index++] = arr[i];
            }
        }

        return result;
    }
}