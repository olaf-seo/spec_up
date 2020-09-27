package DynamicProgramming;

import java.io.*;
import java.util.*;

//2020-09-27 일요일 - 카드 구매하기 2
public class dp16194_1 {
	 public static void main(String args[]) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        int[] d = new int[n+1];
	        int[] a = new int[n+1];

	        StringTokenizer st= new StringTokenizer(br.readLine());
	        
	        for (int i=1; i<=n; i++) {
	            a[i] = Integer.parseInt(st.nextToken());
	            d[i] = -1;
	        }
	        
	        for (int i=1; i<=n; i++) {
	            for (int j=1; j<=i; j++) {
	                if (d[i] == -1 || d[i] > d[i-j] + a[j]) {
	                    d[i] = d[i-j] + a[j];
	                }
	            }
	        }
	        
	        System.out.println(d[n]);
	 }
}
