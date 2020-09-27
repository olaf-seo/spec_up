package DynamicProgramming;

import java.io.*;

//	2020-09-27 일요일 - 1로 만들기 
//	d[n] 은 n 을 1로 만드는 횟수
public class dp1463_2 {
	public static int[] d;
    public static int go(int n) {
    	if(n==1) {
    		return 0;
    	}
    	if(d[n]>0) {
    		return d[n];
    	}
    	d[n] = d[n-1]+1;
    	if(n%2==0) {
    		int temp = d[n/2]+1;
    		if(d[n]>temp) {
    			d[n]=temp;
    		}
    	}else if(n%3==0) {
    		int temp = d[n/3]+1;
    		if(d[n]>temp) {
    			d[n]=temp;
    		}
    	}
    	
    	return d[n];
    }
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        d = new int[n+1];
        System.out.println(go(n));
	}	
	
}
