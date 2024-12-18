class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        int maxIndex = 0;
        int add = 0;
        for(int i = 1; i < sides.length; i++) {
            if(max < sides[i]) {
                max = sides[i];
                maxIndex = i;
            }
        }
        for(int j = 0; j < sides.length; j++) {
            if(maxIndex != j) {
                add += sides[j];
            }
        }
        if(max >= add) {
            return 2;
        } else {
            return 1;
        }
    }
}