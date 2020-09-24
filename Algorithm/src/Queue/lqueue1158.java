package Queue;

import java.io.*;
import java.util.*;

//2020.09.21 월요일 - 조세퍼스 문제 (N 명의 사람을 순서대로 M번째 사람을 제거하여 제거되는 순서)
public class lqueue1158 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
        StringBuilder sb = new StringBuilder();
        sb.append('<');
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<k-1; j++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll() + ", ");
		}
		sb.append(queue.poll() + ">");
		System.out.println(sb);
	
	
	}
}
