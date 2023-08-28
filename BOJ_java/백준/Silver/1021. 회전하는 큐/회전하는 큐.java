import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i=0; i<N; i++)
            list.add(i+1);

        int cnt = 0;

        for (int i=0; i<M;i++) {
            int num = in.nextInt();

            //index와 half는 if문을 만들어주기 위한 것!!
            int index = list.indexOf(num);
            int half = list.size()/2;

            if (index <= half) {
                while (num != list.getFirst()) {
                    list.addLast(list.removeFirst());
                    cnt++;
                }
            }
            else {
                while (num != list.getFirst()) {
                    list.addFirst(list.removeLast());
                    cnt++;
                }
            }
            list.remove();
        }
        System.out.println(cnt);
    }
}