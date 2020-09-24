package Math;

import java.io.*;
import java.util.StringTokenizer;

//	2020.09.23 수요일 - 소수찾기 
public class math1978 {
	static boolean prime(int p) {
		if(p<2) {
			return false;
		}
		for(int i=2; i*i<=p; i++) {
			if( p%i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count=0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(N-->0) {
			int p= Integer.parseInt(st.nextToken());
			if(prime(p)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}




/* 에라토네스의 체
	int prime[100];					// 소수 저장
	int pn = 0;						// 소수 개수
	boll check[101];					// 소수가 아니면(지워 졌으면) true
	int n = 100;						// 100까지 소수
	for(int i=2; i<=n; i++){
		if(check[i] == false){
			prime[pn++] = i;
			for(int j = i*i; j<=n; j+=i){
				check[j] =true;
			}
		}
	
	}








*/