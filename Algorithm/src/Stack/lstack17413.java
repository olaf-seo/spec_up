package Stack;

import java.io.*;
import java.util.Stack;

//	2020.09.22 »≠ø‰¿œ

public class lstack17413 {
	static void print(BufferedWriter bw, Stack<Character> st) throws IOException{
		while(!st.isEmpty()) {
			bw.write(st.pop());
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		 Stack<Character> st = new Stack<Character>();
		 
		 String s = br.readLine();
		 
		 boolean check = false;
		 
		 for(char wa : s.toCharArray()){
			if(wa=='<') {
				print(bw, st);
				check=true;
				bw.write(wa);
			} else if ( wa =='>') {
				check=false;
				bw.write(wa);
			}else if (check) {
				bw.write(wa);
			}else {
				if(wa == ' ') {
					print(bw, st);
					bw.write(wa);
				}else {
					st.push(wa);
				}
			}
		 }
		 print(bw, st);
		 bw.write('\n');
		 bw.flush();
	}
}
