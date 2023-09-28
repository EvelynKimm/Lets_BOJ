import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int price[] = new int[n+1]; //n개의 카드팩을 사기 위한 비용
        int dp[] = new int[n+1]; //n개의 카드팩을 사기 위한 최대 비용

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=1; i<=n; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 0;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                dp[i] = Math.max(dp[i], price[j]+dp[i-j]);
            }
        }
        System.out.println(dp[n]);
    }
}
