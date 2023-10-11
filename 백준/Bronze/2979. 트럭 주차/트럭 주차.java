import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int A = Integer.parseInt(st.nextToken()); // 1대 요금
        int B = Integer.parseInt(st.nextToken()); // 2대 요금
        int C = Integer.parseInt(st.nextToken()); // 3대 요금

        int first = 101; // 가장 먼저 주차장에 도착한 트럭의 시간
        int last = 0; // 가장 늦게 주차장에 도착한 트럭의 시간

        int[][] truck = new int[3][2]; // truck[트럭 세 대][start, end]
        int[] arr = new int[100];
        int fee = 0;

        for (int i = 0; i<3; i++) {
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken()); // 들어온 시간
            int end = Integer.parseInt(st.nextToken()); // 나간 시간

            truck[i][0] = start;
            truck[i][1] = end;

            // 들어온 트럭 체크
            for(int j=start; j<end; j++) {
                arr[j]++;
            }
        }

        for(int i=0; i<3; i++) {
            for (int j=0;j<2; j++) {
                if (truck[i][j] < first) first = truck[i][j]; // 가장 먼저 나간 트럭 시간 찾기
                if (truck[i][j] > last) last = truck[i][j]; // 가장 늦게 나간 트럭 시간 찾기
            }
        }

        // 주차 요금 구하는 for문
        // 각각 1대, 2대, 3대 있을 때
        for(int i=first; i<last; i++) {
            fee += (arr[i] == 1) ? arr[i] * A : 0;
            fee += (arr[i] == 2) ? arr[i] * B : 0;
            fee += (arr[i] == 3) ? arr[i] * C : 0;
        }

        System.out.println(fee);
        bf.close();
    }
}