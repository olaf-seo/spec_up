package Stack;

import java.io.*;
import java.util.Stack;

//	2020.09.19 토요일 - 에디터 ( L, D, B , P  커서 조정)
public class stack1406 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String edit=br.readLine();
		
		Stack<Character> left=new Stack<Character>();
		Stack<Character> right=new Stack<Character>();
		
		for (int i=0; i<edit.length(); i++) {
			left.push(edit.charAt(i));
        }
		
		int n= Integer.parseInt(br.readLine());
		
		while(n-->0) {
			String[] line=br.readLine().split(" ");
			char input=line[0].charAt(0);
			
			if(input=='L') {
				if(!left.isEmpty()) {
					right.push(left.pop());
				}
			}else if(input=='D') {
				if(!right.isEmpty()) {
					left.push(right.pop());
				}
			}else if(input=='B') {
				if(!left.isEmpty()) {
					left.pop();
				}
			}else{
				left.push(line[1].charAt(0));
			}
		}
		
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		StringBuilder sb= new StringBuilder();
		while(!right.empty()) {
			sb.append(right.pop());
		}
		System.out.println(sb);
		
	
	}
}
