package Queue;

import java.io.*;

//	2020.09.21 월요일 - 큐 구현
public class llqueue10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] queue= new int[N];
		int begin=0, end =0;
		
		while(N-->0) {
			String[] ord = br.readLine().split(" ");
			
			if(ord[0].equals("push")) {
				queue[end++] = Integer.parseInt(ord[1]);
			}else if(ord[0].equals("pop")) {
				if(begin == end) {
					System.out.println("-1");
				}else {
					System.out.println(queue[begin]);
					begin++;
				}
			}else if(ord[0].equals("size")) {
				System.out.println((end-begin));
			}else if(ord[0].equals("empty")) {
				if(begin==end) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(ord[0].equals("front")) {
				if(begin==end) {
					System.out.println("-1");
				}else {
					System.out.println(queue[begin]);
				}
			}else {
				if(begin==end) {
					System.out.println("-1");
				}else {
					System.out.println(queue[end-1]);
				}
			}
		}
	}
}
