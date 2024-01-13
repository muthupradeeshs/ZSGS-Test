package evaluation;

import java.util.Scanner;

public class BallDistance {
	public static void main(String[] args) {
		System.out.println("Enter height ; ");
		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
		System.out.println("Enter ball : ");
		double ball = scanner.nextDouble();
		double distance = 0;
		while ((int)height > 0) {
            distance+=height;
            height=height*ball;
            distance+=height;
		}
		distance+=height;
		System.out.println(distance);
	}

}
