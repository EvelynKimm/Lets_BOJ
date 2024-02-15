import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    private static final int MOD = 1_000_000_000;

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] split = line.split(" ");
        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        int[][] dp = new int[N+1][K+1];

        for (int i = 0; i < N + 1; i++) {
            dp[i][1] = 1;
            dp[i][0] = 0;
        }

        for (int i = 0; i < K + 1; i++) {
            dp[1][i] = i;
        }

        for (int i = 2; i < N + 1; i++) {
            for (int j = 1; j < K + 1; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
            }
        }

        bw.write(dp[N][K] + "");

        bw.flush();
        bw.close();
        br.close();
    }
}