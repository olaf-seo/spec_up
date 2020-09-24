package AplusB;

import java.io.*;
import java.util.Scanner;

//2020.09.16 수요일  A+B
public class AplusB10952 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (true) {
			a= sc.nextInt();
			b= sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			System.out.println(a+b);
		}
		sc.close();
	}
}
