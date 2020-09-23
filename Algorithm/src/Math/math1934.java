package Math;

import java.io.*;
import java.util.StringTokenizer;

//	2020.09.23 수요일 - 최소공배수
public class math1934 {
	static int gcd(int a, int b) {
		while(b!=0) {
			int temp=a;
			a=b;
			b=temp%b;
		}
		return a;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int g = gcd(a, b);
			
			System.out.println(a*b/g);
		}
	}
}
