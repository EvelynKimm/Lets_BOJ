import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "nj", "s=", "z="};
		
		int cnt = 0;
		
		for (int i = 0; i<word.length; i++) {
			if (s.contains(word[i])) //해당 배열에 있는 원소가 사용자가 입력한 s문자열에 있는지 검사하는 함수
				s = s.replace(word[i], "!"); //개수 카운트 되면서 중복 위험 없는 특수문자로 변환
		}
		System.out.println(s.length());
	}
}