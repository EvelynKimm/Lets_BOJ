import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int result;

		if (b>=c) { //같은 경우를 생각해주지 않아서 틀림
			System.out.println("-1");
		} else {
			System.out.println((a / (c-b)) +1);
		} 
	}
}