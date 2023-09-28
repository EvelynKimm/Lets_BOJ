import java.util.*;

public class Main {
    public static int N;
    public static int [][] quad;
    public static StringBuilder sb = new StringBuilder();


    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        quad = new int[N][N];

        for (int i=0; i<N; i++) {
            String str = in.next();
            for (int j=0; j<N; j++) {
                quad[i][j] = str.charAt(j)-'0';
            }
        }
        dfs(0,0,N);
        System.out.println(sb);
    }
    
    public static boolean checkNum(int x, int y, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (quad[x][y] != quad[i + x][j + y]) {
                    return false;
                } 
            }

        }
        return true;
    }
    
    public static void checkFull(int x, int y) {
        if (quad[x][y] == 0) {
            sb.append(0);
        } else {
            sb.append(1);
        }
    }
    
    public static void dfs(int x, int y, int N) {
        if (checkNum(x, y, N)) {
            checkFull(x, y);
        } else {
            sb.append("(");
            dfs(x, y, N/2);
            dfs(x, y+N/2, N/2);
            dfs(x+N/2,y, N/2);
            dfs(x+N/2, y+N/2, N/2);
            sb.append(")");
        }
        return;
    }
}
