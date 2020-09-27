package Math;

import java.util.*;

//	2020-09-24 목요일 - 조합 0 의 개수
public class math2004 {
	public static void main(String[] args) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m =sc.nextLong(); 
		
		long two=0, five=0;
		
		for(int i=5; i<=n; i*=5) {
			five+=n/i;
		}
		for(int i=5; i<=n-m; i*=5) {
			five-=(n-m)/i;
		}
		for(int i=5; i<=m; i*=5) {
			five-=m/i;
		}
		
		for(int i=2; i<=n; i*=2) {
			two +=n/i;
		}
		for(int i=2; i<=n-m; i*=2) {
			two -=(n-m)/i;
		}
		for(int i=2; i<=m; i*=2) {
			two -=m/i;
		}
		
		System.out.println(Math.min(five, two));
		
		
	}
}
