
package test1;

import java.util.Scanner;

public class myclass_second {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 9; i++) {
			System.out.println("-----" + i + "��-----");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		System.out.println(x + " x " + y + " = " + (x * y));

		if (x < 1 || x > 999 || y < 1 || y > 999) {
			System.out.println("�Է��� ���� ������ ������ϴ�.");
		}

	}

}