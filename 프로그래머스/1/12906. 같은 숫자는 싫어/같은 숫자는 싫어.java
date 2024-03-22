import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int value = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != value) {
                ans.add(arr[i]);
                value = arr[i];
            }
        }
        return ans.stream().mapToInt(i->i).toArray();
    }
}