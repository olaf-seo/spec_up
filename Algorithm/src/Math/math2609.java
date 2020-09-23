package Math;

import java.io.*;
import java.util.StringTokenizer;

//	2020.09.23 수요일 - 최대공약수, 최소공배수
public class math2609 {
	static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		
		int g= gcd(a,b);
		
		int l = (a*b)/g;
		
		System.out.println(g);
		System.out.println(l);
		
	}
}




/*	최대공약수 Greatest Common Divisor - 유클리드 호제법
	1. int gcd(int a, int b) {
			if(b==0) {
				return a;
			}else {
				return gcd(b, a%b);
			}
		}
	
	2.	int gcd(int a, int b) {
			while(b!=0) {
				int r = a%b;
				a=b;
				b=r;
			}
			return a;
		}
	
	최대공배수 Least Common Multiple - (gcd 응용)
	
	l = g * (a/g) * (b/g)
	  = (a*b)/g


*/