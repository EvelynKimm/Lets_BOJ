import java.util.Scanner;

class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n+1];
        int sum = 0;

        for (int i=1; i<=n; i++) {
            sum += in.nextInt();
            arr[i] = sum; //arr은 누적합을 넣는 리스트임
        }
        for (int i=0; i<m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(arr[b] - arr[a-1]);
        }
    }
}