import java.io.*;
import java.util.*;

class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap <String, String> map = new HashMap<>();
        String [] s;

        for (int i=0; i<n; i++) {
            s = br.readLine().split(" ");
            String site = s[0];
            String pw = s[1];

            map.put(site, pw);
        }
        for (int i=0; i<m; i++) {
            String curio = br.readLine();

            if (map.containsKey(curio))
                bw.write(map.get(curio) + "\n");

        }
        bw.close();
    }
}
