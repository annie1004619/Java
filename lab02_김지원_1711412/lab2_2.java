package hw;

import java.util.Scanner;

public class lab2_2 {
	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// ��� ("2�ڸ��� ���� �Է�(10~99) ") ** % /���
		System.out.print("2�ڸ��� ���� �Է�(10~99)>> ");
		// ���� �Է¹ޱ�
		int num, num_10, num_1;
		num = scan.nextInt();
		num_10= num/10;
		num_1= num%10;
		
		if( num_10 == num_1 )// ���ǹ�
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�");
			//�ٸ� �� ��¹�
		System.out.println("1711412 ������");
		// scanner �ݱ�
		scan.close();
	}
}
