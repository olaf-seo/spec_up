package AplusB;

import java.io.*;
import java.util.Scanner;

//2020.09.16 ��
public class AplusB10951 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (sc.hasNext()) {
			a= sc.nextInt();
			b= sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
}
