package hw;

import java.util.Scanner;

public class lab2_8 {
	public static void main(String[] args) {
		// Scanner ��ü ���� **xl�� x2���� Ŭ���� ���� �ױ����� ������ �����غ��� x1�� x2�� �麸�� �۾ƾ���
		Scanner scan = new Scanner(System.in);
		// ��� ("x1, y1 �Է� >> ")
		System.out.print("x1, y1 �Է� >> ");
		// x1, y1 �Է�
		int x1, y1;
		x1 = scan.nextInt();
		y1= scan.nextInt();
		// ��� ("x2, y2 �Է� >> ")
		System.out.print("x2, y2 �Է� >> ");
		// x2, y2 �Է�
		int x2, y2;
		x2 = scan.nextInt();
		y2= scan.nextInt();
		if(((x1<100)&&(x2<100))||((y1<100)&&(y2<100))||((x1>200)&&(x2>200))||((y1>200)&&(y2>200))) // (x1, y1)�� (x2, y2)�� (100,100),(200,200)�� ������ �ʴ� ���
		//��� ("�浹 ����")	
			System.out.print("�浹 ����");
		else
		// ��� ("�浹 �߻�")
			System.out.print("�浹 �߻�");
		// scanner �ݱ�
		System.out.println("\n1711412 ������");
			scan.close();
	}
}
