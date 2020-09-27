package Math;

import java.io.*;

//	2020-09-24 목요일 - 팩토리얼 0의 개수
public class llmath1676 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int count=0;
		
		for(int i=5; i<=n; i*=5) {
			count += n/i;
		}
		
		System.out.println(count);
	}
}
