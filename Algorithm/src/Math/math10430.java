package Math;

import java.io.*;
import java.util.StringTokenizer;

//	2020.09.23 수요일 - 나머지 문제
public class math10430 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		System.out.println( ((A+B)%C) );
		System.out.println( (((A+B)%C)+(B%C)%C) );
		System.out.println( ((A*B)%C) );
		System.out.println( (((A%C)*(B%C))%C) );
	}
}


