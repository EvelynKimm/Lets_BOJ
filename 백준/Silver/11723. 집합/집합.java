import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // AND 연산(&) : 대응하는 두 비트가 모두 1일 때 1반환
        // OR 연산(|) : 대응하는 두 비트 중 하나라도 1이라면 1, 아니면 0 반환
        // XOR 연산(^) : 대응하는 두 비트가 다르면 1, 같으면 0을 반환
        // NOT 연산(~) : 비트의 값을 반전
        // Shift 연산(<<,>>) : 왼쪽 또는 오른쪽으로 비트를 이동
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int bitset = 0;
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("all")) bitset = (1 << 21) - 1;
            else if(str.equals("empty")) bitset = 0;
            else {
                int num = Integer.parseInt(st.nextToken());
                if(str.equals("add")) {
                    bitset |= (1<<num);
                } else if(str.equals("remove")) {
                    bitset &= ~(1<<num);
                } else if(str.equals("check")) {
                    sb.append((bitset&(1<<num)) != 0 ? 1 :0).append("\n");
                } else if(str.equals("toggle")) {
                    bitset ^= (1<<num);
                }
            }
        }
        System.out.println(sb);
    }
}
