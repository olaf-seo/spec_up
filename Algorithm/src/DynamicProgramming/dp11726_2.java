package DynamicProgramming;

import java.io.*;

//2020-09-27 일요일 - 2 x n 타일링
public class dp11726_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int d[] =new int[n+1];
		d[0]=1;
		d[1]=1;
		
		for(int i=2; i<=n; i++) {
			d[i]=(d[i-1]+d[i-2])%10007;
		}
		System.out.println(d[n]);
		
	}
}
