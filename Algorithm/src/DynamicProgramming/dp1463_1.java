package DynamicProgramming;

import java.io.*;

//	2020-09-27 일요일 - 1로 만들기
public class dp1463_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] d = new int[n+1];
		d[1]=0;
		for(int i=2; i<=n; i++) {
			d[i] = d[i-1]+1;
			if (i%2 == 0 && d[i] > d[i/2] + 1) {
                d[i] = d[i/2] + 1;
            }
            if (i%3 == 0 && d[i] > d[i/3] + 1) {
                d[i] = d[i/3] + 1;
            }
		}
		
	}	
	
}
