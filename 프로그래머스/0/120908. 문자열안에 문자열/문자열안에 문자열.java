class Solution {
    public int solution(String str1, String str2) {
        int str1length = str1.length();
        int str2length = str2.length();
        
        for(int i = 0; i <= str1length - str2length; i++){
            boolean found = true;
            for(int j = 0; j < str2length; j++){
                if(str1.charAt(i + j) != str2.charAt(j)){
                    found = false;
                    break;
                }
            }
            if(found){
                return 1;
            }   
        }
        return 2;
    }
}