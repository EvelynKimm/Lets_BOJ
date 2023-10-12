import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
//stack을 순서용으로만 사용하는 것!!!!!!!!!
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int [] arr = new int[num +1]; //각 탑의 높이를 받는 배열
        int [] output = new int [num+1]; //각 정답을 삽입받는 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); //arr배열안에 넣어주기
        }

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i< num; i++) {
            while( stack.size() > 0) {
                if (arr[stack.peek()] >= arr[i]) { //스택을 입력받은 적이 없는데..?
                    output[i] = stack.peek() + 1;
                    break;
                }
                else {
                    stack.pop();
                }
            }
            stack.push(i);
        }
        for (int i=0; i<num; i++) {
            sb.append(output[i]).append(" ");
        }
        System.out.println(sb);
    }
}