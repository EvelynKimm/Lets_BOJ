import java.util.Scanner;

public class Main {

    static int n;
    static long b;
    static int[][] map;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        b = in.nextLong();

        map = new int[n][n];

        //행렬 입력
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                map[i][j] = in.nextInt();
            }
        }
        //함수 호출
        int [][] ans = Divide(b);

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(ans[i][j]%1000 + " ");
            }
            System.out.println();
        }
    }
    //제곱 (분할정복)
    public static int[][] Divide (long num) {
        if (num == 1) {
            return map;
        }
        int[][] tmp = Divide(num/2);
        if (num%2==0) return cal(tmp, tmp);
        else return cal(cal(tmp, tmp), map);
    }
    //행렬 곱셈 계산
    public static int[][] cal (int[][] arr1, int[][] arr2) {
        int size = arr1[0].length;
        int[][] temp = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int sum = 0;
                for (int k = 0; k < size; k++) {
                    sum = (sum + arr1[i][k] * arr2[k][j]) % 1000;
                }
                temp[i][j] = sum;
            }
        }
        return temp;
    }
}