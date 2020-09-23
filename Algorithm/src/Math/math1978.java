package Math;

import java.io.*;
import java.util.StringTokenizer;

//	2020.09.23 ������ - �Ҽ� ����
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




/* �����佺�׳׽��� ü
	int prime[100];					// �Ҽ�����
	int pn = 0;						// �Ҽ��� ����
	boll check[101];					// ���������� true
	int n = 100;						// 100���� �Ҽ�
	for(int i=2; i<=n; i++){
		if(check[i] == false){
			prime[pn++] = i;
			for(int j = i*i; j<=n; j+=i){
				check[j] =true;
			}
		}
	
	}








*/