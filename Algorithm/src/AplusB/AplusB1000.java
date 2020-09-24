package AplusB;

import java.io.*;
import java.util.StringTokenizer;

//	2020.09.16 수요일  A+B
public class AplusB1000 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
		
	}

}
 