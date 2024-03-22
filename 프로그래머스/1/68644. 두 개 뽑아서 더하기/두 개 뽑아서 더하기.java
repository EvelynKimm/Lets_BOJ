import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();
        
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                arrList.add(numbers[i]+numbers[j]);
            }
        }
        for (int i=0; i<arrList.size(); i++) {
            if (!answerList.contains(arrList.get(i))) {
                answerList.add(arrList.get(i));
            }
        }
        Collections.sort(answerList);
        return answerList.stream().mapToInt(i->i).toArray();
    }
}