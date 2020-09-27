package Math;

import java.io.*;
import java.util.StringTokenizer;

//	2020.09.23 수요일 - 소수 구하기
public class math1929 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		
		int[] prime = new int[n];					// 소수 저장
		int pn = 0;
		boolean[] check = new boolean[n-m+1];
		
		for(int i=2; i<=n; i++) {
			if(!check[i]) {
				prime[pn++]=i;
				for(int j=i*i; j<=n; j+=i) {
					check[j]=true;
				}
			}
		}

		for(int p: prime) {
			if(p!=0) {
				System.out.println(p);
			}
		}
		
	}
}
