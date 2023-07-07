import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num+1];

        //연산 위해 0,1은 미리 설정
        dp[0] = 0;
        dp[1] = 0;

        //0과 1은 이미 설정되었으므로 i=2부터 시작 등호 주의!!
        for (int i=2; i<=num; i++) { // []내에 있는 것이 연산을 진행해줄 숫자들
            dp[i] = dp[i - 1] + 1; // 먼저 1을 빼준다
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 1을 뺀 값과 2로 나눈 값 중 최솟값을 dp[i]에 저장한다
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 1을 뺀 값과 2로 나눈 값 중 최소값인 dp[i] 와 3으로 나눈 값 중 최솟값을 dp[i]에 저장한다
        }
        System.out.println(dp[num]);
    }
}