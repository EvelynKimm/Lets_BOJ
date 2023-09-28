import java.io.*;
import java.util.*;

class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue <Integer> queue = new LinkedList<>();

        for (int i=1; i<=N; i++) {
            queue.add(i);
        }

        sb.append("<");
        while(queue.size() != 1) { //queue 사이즈가 1이 되기 전까지
            for (int i=1; i<K; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
