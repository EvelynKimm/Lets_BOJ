import java.io.*;
import java.util.*;

class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> groups = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        for (int i=0; i<N; i++) {
            String team = br.readLine(); //그룹 이름 입력받기
            int num = Integer.parseInt(br.readLine()); //그룹원 명수

            for (int j=0; j<num; j++) {
                sb.append(br.readLine()+" "); //멤버들 sb로 받기
            }
            groups.put(team, sb.toString());
            sb.setLength(0); //StringBuilder 초기화
        }

        for (int i=0; i<M; i++) {
            String str = br.readLine();
            int num = Integer.parseInt(br.readLine());
            arr.clear();

            //1을 입력받았을 때 (그룹이름 입력, 그룹멤버 출력)
            if (num ==0) {
                StringTokenizer stt = new StringTokenizer(groups.get(str), " ");
                while (stt.hasMoreTokens()) arr.add(stt.nextToken());
                Collections.sort(arr);
                for (int j=0; j<arr.size();j++) {
                    bw.write(arr.get(j)+"\n");
                }
            }
            //0을 입력받았을 때 (그룹멤버 입력, 그룹이름 출력)
            else {
                Iterator<String> iter = groups.keySet().iterator();
                while (iter.hasNext()) {
                    String key = iter.next();
                    StringTokenizer sttt = new StringTokenizer(groups.get(key), " ");
                    while(sttt.hasMoreTokens()) {
                        String strr = sttt.nextToken();
                        if (str.equals(strr)) bw.write(key + "\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
