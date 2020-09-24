package AplusB;

import java.io.*;
import java.util.StringTokenizer;

//2020.09.16 수요일  A+B
public class AplusB11021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=1; i<=t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+(a+b));
		}
	}
}
