class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < length - 4; i++) {
            sb.append("*");
        }
        
        sb.append(phone_number.substring(length - 4));
        
        return sb.toString();
    }
}