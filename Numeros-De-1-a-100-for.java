package main;

public class Main {
	public static void main(String args[]) {
		
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}
		
		int sum = 0;
		for (int j = 1; j < 101; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
				sum += j;
			}
		}
		System.out.println(sum);
	}
}
