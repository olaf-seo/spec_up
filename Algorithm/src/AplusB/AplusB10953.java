package AplusB;

import java.io.*;

//2020.09.16 ¸ñ
public class AplusB10953 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while (t-->0) {
			String array[] = br.readLine().split(",");
			System.out.println(Integer.parseInt(array[0])+Integer.parseInt(array[1]));
		}
	}
}
