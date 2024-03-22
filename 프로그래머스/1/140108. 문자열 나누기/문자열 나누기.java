import java.util.*;

class Solution {
    public int solution(String s) {
        char first = s.charAt(0);
        int sameCnt = 0;
        int diffCnt = 0;
        int wordCnt = 0;
        
        for (int i=0; i<s.length(); i++) {
            if (sameCnt == diffCnt) {
                wordCnt++;
                sameCnt = 0;
                diffCnt = 0;
                first = s.charAt(i);
            }
            if (s.charAt(i)==first) {
                sameCnt++;
            } else {
                diffCnt++;
            }
        }
        return wordCnt;
    }
}