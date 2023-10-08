import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;

            if (n == 0) break; //0나오면 break


            for (int i = n+1; i<= 2*n; i++) {
                int cnt = 0;
                if (i==1) cnt++; //소수가 아니다

                for (int j=2; j<=Math.sqrt(i); j++) { //각 제곱근 사이의 수의 배수까지 삭제해야 함
                    if (i%j==0) {
                        cnt++; //소수가 아니다
                        break;
                    }
                }

                if (cnt==0) { //소수는 cnt=0 임
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}