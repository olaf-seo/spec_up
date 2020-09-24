package Stack;

import java.io.*;

//	2020.09.19 토요일 - 스택 구현
public class stack10828 {
	static int stack[];
	static int size;
	static int n;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		n= Integer.parseInt(br.readLine());
		
		while(n-->0) {
			String []line=br.readLine().split(" ");
			if(line[0].equals("push")) {
				int num=Integer.parseInt(line[1]);
				stack[size++]=num;
			}else if(line[0].equals("pop")) {
				if(size!=0) {
					System.out.println(stack[size-1]);
                    size--;
				}else {
					System.out.println("-1");
				}
			}else if(line[0].equals("size")) {
				System.out.println(size);
			}else if(line[0].equals("empty")) {
				if(size!=0) {
					System.out.println("0");
				}else {
					System.out.println("1");
				}
			}else if(line[0].equals("top")) {
				if(size!=0) {
					System.out.println(stack[size-1]);
				}else {
					System.out.println("-1");
				}
			}
		}
	}
}





//static int[] stack;
//static int t;
//
//static void push (int x) {
//	stack[t]=x;
//	t++;
//}
//
//static void pop() {
//	if(t<=0) {
//		System.out.println( "-1" );
//	}else {
//		System.out.println(stack[t]);
//	}
//	t--;
//}
//
//static void size() {
//	System.out.println((t+1));
//}
//
//static void empty() {
//	if(t<=0) {
//		System.out.println(1);
//	}else {
//		System.out.println(0);
//	}
//}
//
//static void top() {
//	if(t<=0) {
//		System.out.println(-1);
//	}else {
//		System.out.println(stack[t]);
//	}
//}
//
//public static void main(String[] args) throws NumberFormatException, IOException {
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	int N = Integer.parseInt(br.readLine());
//	
//	StringTokenizer st;
//	
//	while (N-->0) {
//		st= new StringTokenizer(br.readLine());
//		
//	}
//	
//}