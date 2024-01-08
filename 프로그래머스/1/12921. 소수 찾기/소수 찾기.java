class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=0; i<=n; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }
        return answer;
    }
    public boolean isPrime(int n) {
        if (n<=1) return false;
        else if (n==2) return true;
        for (int i=2; i<= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}