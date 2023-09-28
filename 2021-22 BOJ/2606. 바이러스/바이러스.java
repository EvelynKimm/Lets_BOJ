import java.util.Scanner;

public class Main {
    static int cnt = 0; //감염시킨 컴퓨터의 수
    //dfs 메소드
    static void dfs(int[][] a, boolean[] check, int v) {
        if (check[v]==true) return; //재귀호출 종료

        check[v] = true; //방문처리
        cnt++; //최초 방문 1번 컴퓨터도 포함된다

        for (int i=0; i<a[v].length; i++) { //인접행렬 탐색
            if (a[v][i]==1 && !check[i]) //연결된 정점이면서 방문하지 않은 경우
                dfs(a, check, i); //dfs 수행
        }
    }
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int e = in.nextInt();

        int a[][] = new int[n+1][n+1]; //그래프를 인접행렬로 표시
        boolean check[] = new boolean[n+1]; //방문 여부 배열

        for (int i=0; i<e; i++) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();

            a[v1][v2] = a[v2][v1] = 1; //여기서 초기화했기 때문에 1이면 방문하지 않았다는 증거가 됨
        }

        dfs(a, check, 1);

        System.out.println(cnt-1);
    }
}
