package hw;

import java.util.Scanner;

public class lab2_4 {
	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// ��� ("���� 3�� �Է� >> ")
		System.out.print("���� 3�� �Է� >> ");
		// ���� ���� �Է� �ޱ�
		int a,b,c;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		// �߰� �� mid ���ϱ� -> Math.max, Math.min ����ؼ�
		int max = Math.max(Math.max(a,b),c);
		int min = Math.min(Math.min(a, b), c);
		int mid = a+b+c -max -min;
		// ��� ("�߰� ���� " + mid)
		System.out.print("�߰� ���� " + mid);
		// scanner �ݱ�
		System.out.println("\n1711412 ������");
		scan.close();
	}
}
