package algorithm;

import java.util.Scanner;

// 백준 14681번 사분면 
public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int X = s.nextInt();
		int Y = s.nextInt();
		
		if(X > 0) {
			if(Y > 0) {
				System.out.print(1);
			} else {
				System.out.print(4);
			}
		} else if (Y > 0) {
			System.out.print(2);
		} else {
			System.out.print(3);
		}
		s.close();

	}

}
