package Stack;

import java.io.*;
import java.util.Stack;

//	2020.09.22 화요일 - 쇠막대기 문제(레이저)
public class stack10799 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		 Stack<Integer> st = new Stack<Integer>();
		 
		 String r = br.readLine();
		 int num=1;
		 
		 int stick=0;
		 
		 for(char ch: r.toCharArray()) {
			 if(ch=='(') {
				 st.push(num++);
			 }else {
				 if(st.pop()==num-1) {
					 stick+=st.size();
				 }else {
					 stick++;
				 }
				 num++;
			 }
		 }
		 
		 System.out.println(stick);
		 
		 
	}
}
