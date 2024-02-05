import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] map;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        int maxHeight = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] > maxHeight) {
                    maxHeight = map[i][j];
                }
            }
        }

        int max = 0;
        for (int height = 0; height < maxHeight + 1; height++) {
            visit = new boolean[N][N];
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (!visit[j][k] && map[j][k] > height) {
                        cnt += dfs(j, k, height);
                    }
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }

    static int dfs(int x, int y, int height) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int next_x = x + dx[i];
            int next_y = y + dy[i];

            if (next_x < 0 || next_y < 0 || next_x > N-1 || next_y > N-1) {
                continue;
            }
            if (visit[next_x][next_y]) {
                continue;
            }
            if (map[next_x][next_y] > height) {
                dfs(next_x, next_y, height);
            }
        }
        return 1;
    }
}
