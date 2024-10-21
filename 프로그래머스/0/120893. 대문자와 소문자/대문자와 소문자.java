class Solution {
    public String solution(String my_string) {
        char[] array = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            array[i] = my_string.charAt(i);
            if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] = (char)(array[i] + 32);
            }
            else if(array[i] >= 'a' && array[i] <= 'z'){
                array[i] = (char)(array[i] - 32);
            }   
        }
        return new String(array);
    }
}