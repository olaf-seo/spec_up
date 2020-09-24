package Stack;

import java.io.*;

//	2020.09.19 토요일 - 괄호 (올바른 괄호 숫자)
public class stack9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t= Integer.parseInt(br.readLine());
		
		while (t-->0) {
			int num=0;
			String input = br.readLine();
			 
			 for(char ch : input.toCharArray()) {
				 if(ch=='(') {
					num++; 
				 }else {
					 if(num<=0) {
						 num--;
						 break;
					 }else {
						 num--;
					 }
				 }
			 }
			 if(num==0) {
				 bw.write("YES" +"\n");
			 }else {
				 bw.write("NO"+"\n");
			 }
		}
		bw.flush();
	
	}
}


//	public static String function(String s) {
//		int n=s.length();
//		int size=0;
//		for(int i=0;i<n; i++) {
//			if(s.charAt(i)=='(') {
//				size+=1;
//			}else {
//				size-=1;
//			}
//			if(size<0) {
//				return "NO";
//			}
//		}
//		if(size==0) {
//			return "YES";
//		}else {
//			return "NO";
//		}
//		
//	}
//	
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//		int T= Integer.parseInt(br.readLine());
//		while(T-->0) {
//			System.out.println(function(br.readLine()));
//		}
//	}
//	
//	
