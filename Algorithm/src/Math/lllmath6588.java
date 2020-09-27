package Math;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//	2020-09-24 목요일 - 골드바흐의 추측
public class lllmath6588 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int max = 100000;
		
		boolean[] check = new boolean[max+1];
		ArrayList<Integer> prime = new ArrayList<Integer>();
		check[0]=check[1]=true;
		
		for(int i=2; i*i <= max; i++) {
			if(check[i]==true) {
				continue;
			}
			prime.add(i);
			for(int j=i*i; j<=max; j+=i) {
				check[j] = true;
			}
		}
		
		while(true) {
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			for(int i=1; i<prime.size(); i++) {
				int p = prime.get(i);
				if(p==0) {
					System.out.println("Goldbach's conjecture is wrong.");
					break;
				}
				if(check[n-p] == false) {
					System.out.println(n+" = "+ p +" + "+ (n-p));
					break;
				}
			}
			
		}
			
		

	}
}