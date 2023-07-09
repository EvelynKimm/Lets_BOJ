import java.util.Scanner;

class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int[] dp = new int[n+1];
        int[] arr = new int[n+1];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        dp[1] = 1; //첫 원소가 가질 수 있는 LIS의 값은 본인 그 자체의 길이
        int max =1; //최대 LIS의 값
        for (int i=0; i<n; i++) {
            dp[i] = 1; //다른 원소들 모두 본인 그 자체의 길이를 바탕으로 초기화하기 위해 1로 선언
            for (int j=0; j<i; j++) {
                if (arr[i] > arr[j]) { //i의 숫자가 j보다 항상 더 높다
                    //dp테이블에 저장된 LIS를 바탕으로 가장 큰 값을 dp[i]의 값으로 갱신
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            //전체 수열에서 LIS의 값 갱신하기
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}