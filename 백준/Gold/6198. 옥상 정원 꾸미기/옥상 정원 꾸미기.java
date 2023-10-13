import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long cnt = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            while (!stack.empty() && stack.peek() <= tmp) {
                //stack에 원소가 있거나 stack의 top이 원소값보다 작거나 같다면 pop해주기
                stack.pop();
            }
            stack.push(tmp); //stack에 원소값 넣어주기
            cnt += stack.size() -1;
        }
        System.out.println(cnt);
    }
}