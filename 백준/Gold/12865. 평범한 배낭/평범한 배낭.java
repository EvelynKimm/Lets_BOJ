import java.util.Scanner;

class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] w = new int[n+1];
        int[] v = new int[n+1];

        int[][] dp = new int[n+1][k+1];

        for(int i=1;i<=n;i++) {
            w[i] = in.nextInt();
            v[i] = in.nextInt();
        }

        for (int i=1; i<=n;i++) {
            for (int j=1; j<=k;j++) {
                dp[i][j] = dp[i-1][j];
                if (j - w[i]>=0) {
                    //현재 남는 무게가 있다면, 맞는 무게의 가치와 현재가치를 더한 값과 현재까지 더한 가치의 크기를 비교한다.
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
                }
            }
        }
        System.out.print(dp[n][k]);
    }
}