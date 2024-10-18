class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        
        if (0 < angle && angle < 90) {
            angle = 1;
            return angle;
        } else if (angle == 90) {
            angle = 2;
            return angle;
        } else if (90 < angle && angle < 180) {
            angle = 3;
            return angle;
        } else if (angle == 180) {
            angle = 4;
            return angle;
        } else {
            return 0;
        }
    }
}