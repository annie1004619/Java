package hw;

import java.util.Scanner;

public class lab2_6 {
	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// ��� ("1~99 ������ ������ �Է��Ͻÿ� >> ")
		System.out.print("1~99 ������ ������ �Է��Ͻÿ� >> ");
		// ���� �Է�
		int num, num_10, num_1;
		num = scan.nextInt();
		// ���� �ڸ�, ���� �ڸ� �� ���� ���ϱ�
		num_10 = num/10;
		num_1 = num%10;
		
		if (((num_10==3)||(num_10==6)||(num_10==9))&&((num_1==3)||(num_1==6)||(num_1==9))) // ���� �ڸ�, ���� �ڸ� ��� 3, 6, 9 �� �ϳ� ** �ص� ���� ��� �Ʒ� ������ ���� �ٲ�� �ȵ�
		// ��� ("�ڼ� ¦¦")
			System.out.print("�ڼ� ¦¦");
		else if(((num_10==3)||(num_10==6)||(num_10==9))||((num_1==3)||(num_1==6)||(num_1==9))) // ���� �ڸ�, ���� �ڸ� �� �ϳ��� 3, 6, 9 �� �ϳ�
		// ��� ("�ڼ� ¦")
			System.out.print("�ڼ� ¦");
		else
		// ��� ("�ڼ� ����")
			System.out.print("�ڼ� ����");
		// scanner �ݱ�
		System.out.println("\n1711412 ������");
			scan.close();
	}
}
