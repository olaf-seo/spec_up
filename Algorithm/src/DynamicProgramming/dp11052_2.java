//package DynamicProgramming;
//
//import java.util.*;
//
////2020-09-27 일요일 - 카드 구매하기
//public class dp11052_2 {
//	static int[] d;
//	static int[] a;
//	static int function(int t) {
//		if(d[t]>0 || t==0)  {
//			return d[t];
//		}else {
//			return d[t];
//		}
//		
//	}
//
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		a = new int[n+1];
//		d = new int[n+1];
//		
//		d[0]=0;
//		for (int i=1; i<=n; i++) {
//		    a[i] = sc.nextInt();
//		}
//		
//		System.out.println(function(n));
//		
//		sc.close();
//		
//	 }
//}
