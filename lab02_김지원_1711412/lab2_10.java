package hw;

import java.util.Scanner;

public class lab2_10 {
	public static void main(String[] args) {
		// Scanner ��ü ���� **��°���� �̸� �й� 
		Scanner scan = new Scanner(System.in);
		// ��� ("���� �߽� x1, y1, ������ radius1 >> ")
		System.out.print("���� �߽� x1, y1, ������ radius1 >> ");
		// x1, y1, r1 �Է�
		int x1, y1, r1;
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		r1 = scan.nextInt();
		// ��� ("���� �߽� x2, y2, ������ radius2 >> ")
		System.out.print ("���� �߽� x2, y2, ������ radius2 >> ");
		// x2, y2, r2 �Է�
		int x2, y2, r2;
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		r2 = scan.nextInt();
		// �� ���� �߽� ������ �Ÿ� ���ϱ�
		double distance = Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1),2));
		
		if (distance > r1+r2) // ���� ��ġ�� �ʴ� ��� (�������� �� �� �̿�)
		// ���
			System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
		else
		// ���
			System.out.print("�� ���� ���� ��ģ��.");
		// scanner �ݱ�
		System.out.println("\n1711412 ������");
			scan.close();
	}
}
