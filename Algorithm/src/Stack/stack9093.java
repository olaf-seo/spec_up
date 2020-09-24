package Stack;

import java.io.*;
import java.util.Stack;

//	2020.09.19 토요일 - 문자 뒤집기
public class stack9093 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t= Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String S=br.readLine()+"\n";
			Stack<Character> stack=new Stack<Character>();
			for (char ch : S.toCharArray()) {
				if(ch=='\n' || ch==' ') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				}else {
					stack.push(ch);
				}
			}
		}
		bw.flush();
	}
	

}


//static void print(Stack<Character> st) throws Exception {
//	while (!st.isEmpty()) {
//		System.out.print( st.pop() );
//	}
//}
//
//public static void main(String[] args) throws Exception {
//	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//	int n= Integer.parseInt(br.readLine());
//	
//	Stack<Character> st = new Stack<Character>();
//	
//	while(n-->0) {
//		String p=br.readLine();
//		
//		for(int i=0; i<p.length(); i++) {
//			if(p.charAt(i)==' ') {
//				print(st);
//				System.out.print(" ");
//			}else {
//				st.push(p.charAt(i));
//				if( (i+1)==p.length()) {
//					print(st);
//					System.out.println();
//				}
//			}
//		}
//	}
//}
