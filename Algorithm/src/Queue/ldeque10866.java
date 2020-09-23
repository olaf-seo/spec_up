package Queue;

import java.io.*;
import java.util.ArrayDeque;

//2020.09.21 ¿ù¿äÀÏ
public class ldeque10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		 ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		 while(n-->0) {
	            String[] s = br.readLine().split(" ");
	            String ord = s[0];
	            if (ord.equals("push_front")) {
	                int x = Integer.parseInt(s[1]);
	                queue.offerFirst(x);
	            } else if (ord.equals("push_back")) {
	                int x = Integer.parseInt(s[1]);
	                queue.offerLast(x);
	            }  else if (ord.equals("front")) {
	                if (queue.isEmpty()) {
	                    System.out.println("-1");
	                } else {
	                    System.out.println(queue.peekFirst());
	                }
	            } else if (ord.equals("size")) {
	                System.out.println(queue.size());
	            } else if (ord.equals("empty")) {
	                if (queue.isEmpty()) {
	                    System.out.println("1");
	                } else {
	                    System.out.println("0");
	                }
	            } else if (ord.equals("pop_front")) {
	                if (queue.isEmpty()) {
	                    System.out.println("-1");
	                } else {
	                    System.out.println(queue.pollFirst());
	                }
	            } else if (ord.equals("pop_back")) {
	                if (queue.isEmpty()) {
	                    System.out.println("-1");
	                } else {
	                    System.out.println(queue.pollLast());
	                }
	            } else if (ord.equals("back")) {
	                if (queue.isEmpty()) {
	                    System.out.println("-1");
	                } else {
	                    System.out.println(queue.peekLast());
	                }
	            }
	        }
	}
}
