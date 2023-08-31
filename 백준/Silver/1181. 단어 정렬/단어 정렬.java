import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

   public static void main(String[] args)throws IOException{
      
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(br.readLine());
	   StringBuilder sb = new StringBuilder();
	   List<String> list = new ArrayList<String>();
	   
	   //입력값을 list를 저장
	   for (int i=0; i<n; i++) {
		   list.add(br.readLine());
	   }
	   //정렬
	   Collections.sort(list);
	   
	   //입력 값의 길이 제한이 50이니까 1~50 확인
	   for (int i=1; i<=50; i++) {
		   for (int j=0; j<list.size();) {
			   //해당 인덱스 값의 길이가 i와 같다면 sb에 저장, list에서 해당하는 모든 값 제거
			   if (list.get(j).length() == i) {
				   sb.append(list.get(j)).append('\n');
				   list.removeAll(Arrays.asList(list.get(j)));
				//어렵네..
			   } else {
				   j++;
			   }
			 
		   }
		   if (list.isEmpty()) break;
	   }
	   System.out.println(sb);
   }
}