package init;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a,b,total;
		System.out.print("Number 1 ");
		a = in.nextInt();
		System.out.print("Number 2 ");
		b = in.nextInt();
		
		total = a + b;
		System.out.print("Total "+total);
	}

}
