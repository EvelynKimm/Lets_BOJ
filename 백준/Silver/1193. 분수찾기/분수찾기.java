import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int i=1;
		int sum = 0;
		int top = 0;
		int bot = 0;
		
		while (true) {
			sum += i;
			if (sum>= X) {
				break;
			} else  {
				i++;
			}
		}
		int w = i - (sum - X);
		if (i%2 == 0) {
			for (int j=0; j<w; j++) {
				top = j+1;
				bot = i-j;
			}
		} else {
			for (int j=0; j<w; j++) {
				top = i-j;
				bot = j+1;
			}
		}
		System.out.println(top + "/" + bot);

	}
}
