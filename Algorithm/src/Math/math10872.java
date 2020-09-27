package Math;

import java.io.*;

//	2020-09-24 목요일 - 팩토리얼
public class math10872 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int fact=1;
		
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		
		System.out.println(fact);
	}
}
