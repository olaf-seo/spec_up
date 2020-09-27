package DynamicProgramming;

import java.io.*;

//2020-09-27 일요일 - 1, 2, 3 더하기
public class dp9095_2 {
	static int d[];
	static int function(int t) {
		if(d[t]>0) {
			return d[t];
		}else {
			d[t]=function(t-1)+function(t-2)+function(t-3);
			return d[t];
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
//		배열 개수 주의 - array index out of exception
		d= new int[12];
		d[0]=1;
		d[1]=1;
		d[2]=2;
		while(n-->0) {
			int t= Integer.parseInt(br.readLine());
			System.out.println(function(t));
		}
		
	}
}
