class Solution {
    public int[] solution(int n) {
        int count;
        
        if(n % 2 == 0){
            count = n/2;
        }else{
            count = n/2 + 1;
        }
        
        int[] answer = new int[count];
        
        int x = 1;
        for(int i = 0; i < answer.length; i++){
            answer[i] = x;
            x = x + 2;
        }
        return answer; 
    }
}