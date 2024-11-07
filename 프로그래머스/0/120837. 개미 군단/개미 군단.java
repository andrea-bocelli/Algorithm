class Solution {
    public int solution(int hp) {
        int generalAnts = hp / 5;
        int remainder = hp % 5;
        int soldierAnts = remainder / 3;
        int workerAnts = remainder % 3;
        return generalAnts + soldierAnts + workerAnts;
    }
}