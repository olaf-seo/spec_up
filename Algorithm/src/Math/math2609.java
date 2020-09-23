package Math;

import java.io.*;
import java.util.StringTokenizer;

//	2020.09.23 ������ - �ִ�����, �ּҰ����
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




/*	�ִ����� Greatest Common Divisor - ��Ŭ���� ȣ����
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
	
	�ִ����� Least Common Multiple - (gcd ����)
	
	l = g * (a/g) * (b/g)
	  = (a*b)/g


*/