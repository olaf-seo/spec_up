package DynamicProgramming;

import java.io.*;

//2020-09-27 일요일 - 2 x n 타일링 2
public class dp11727_1 {
	static int d[];
	static int function(int n) {
		if(d[n]>0) {
			return d[n];
		}else {
			d[n]=(function(n-1)+2*function(n-2))%10007;
			return d[n];
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		d= new int[n+1];
		d[0]=1;
		d[1]=1;
		System.out.println(function(n));
		
	}
}
