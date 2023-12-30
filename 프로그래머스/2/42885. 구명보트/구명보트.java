import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int totalWeight = 0;
        int answer = 0;

        Arrays.sort(people);

        int minPosition = 0;
        int maxPosition = people.length-1;

        while(minPosition <= maxPosition) {
            if(people[minPosition] + people[maxPosition] <= limit) {
                minPosition++;
            }
            maxPosition--;
            answer++;
        }
        return answer;
    }
}