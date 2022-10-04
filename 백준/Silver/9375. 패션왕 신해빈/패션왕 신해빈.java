import java.util.*;

class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        //애초에 HashMap에 넣을 요소가 틀렸음. 
        int N = in.nextInt();
        for (int i=0; i<N; i++) {
            int M = in.nextInt();
            int cnt = 1;
            HashMap<String, Integer> map = new HashMap<>();
            for (int j=0; j<M; j++) {
                String name = in.next();
                String type = in.next();
                if (map.get(type) == null) {
                    map.put(type, 1);
                } else {
                    map.put(type, map.get(type)+1);
                }
            }
            for (int val : map.values()) {
                cnt *= (val+1); //none의 경우의 수를 +1해주는 것
            }
            System.out.println(cnt - 1); //모두 none인 경우를 -1해주는 것
        }
    }
}