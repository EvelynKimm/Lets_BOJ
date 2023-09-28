import java.io.*;
import java.util.*;

class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<String> set = new HashSet<>();
        String S = br.readLine();

        for (int i=0; i<S.length(); i++) {
            for (int j=i+1; j<=S.length(); j++) {
                set.add(S.substring(i, j));
            }
        }
        sb.append(set.size()+"\n");
        System.out.println(sb);
    }
}
