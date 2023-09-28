import java.io.*;
import java.util.*;

class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        LinkedHashSet <String> set = new LinkedHashSet<>();
        //HashSet처럼 중복은 허락하지 않으나, 입력한 순서대로 출력가능
        //HashSet은 순서 허용 X

        for (int i=0; i<L; i++) {
            String n = br.readLine();
            //String으로 받아서 contains메서드로 첫번째 중복 없애준다

            if(set.contains(n)) set.remove(n);
            set.add(n);

        }
        for (String ans : set) {
            if (K<=0) break;

            System.out.println(ans);
            K--;
        }
    }
}
