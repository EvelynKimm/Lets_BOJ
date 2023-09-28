import java.io.*;
import java.util.*;

class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        //맨 처음 커서가 문자열 맨 뒤에 위치하므로 문자열을 모두 왼쪽 스택에 넣어줌
        //그리고 커서가 왼쪽으로 이동하면 왼쪽 스택의 가장 상단 요소를 오른쪽 스택에 pop 시켜줌
        //커서가 오른쪽으로 이동하면 오른쪽 스태그이 가장 상단 요소를 왼쪽 스택에 pop 시켜주며
        //커서가 이동하는 것처럼 구현한다.
        String[] arr = str.split("");
        for (String s: arr) {
            left.push(s);
        }

        for (int i=0; i<M; i++) {
            String cmd = br.readLine();
            char c = cmd.charAt(0);

            switch (c) {
                case 'L':
                    if (!left.isEmpty()) right.push(left.pop());
                    break;
                case 'D':
                    if (!right.isEmpty()) left.push(right.pop());
                    break;
                case 'B' :
                    if (!left.isEmpty()) left.pop();
                    break;
                case 'P' :
                    char t = cmd.charAt(2);
                    left.push(String.valueOf(t));
                    break;
            }
        }

        while (!left.isEmpty()) right.push(left.pop());
        while (!right.isEmpty()) bw.write(right.pop());

        bw.flush();
        bw.close();
    }
}
