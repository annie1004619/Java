package hw;

import java.util.Scanner;

public class Lab3_16 {
// if else if ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		//  { "����", "����", "��" } �� ���ڿ� �迭 �����
		String option[] = { "����", "����", "��" };
		// ���� �ݺ�
		while(true) {
			// ��� ("��ǻ�Ϳ� ���������� ������ �մϴ�")
			System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�");
			// ��� ("���� ���� ��!>> ")
			System.out.print("���� ���� ��!>> ");
			// ����ڷκ��� String �Է� �ޱ�
			String input;
			input = scan.next();
			// ����ڰ� "�׸�"�� �Է�������
				// ���� �� (�ݺ��� ��)
			if(input.equals("�׸�"))
				break;
				
			// ��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���� 0~2�� ���� ����
			int n;
			n = (int)(Math.random()*3);
			// ������� ���ð� ��ǻ���� ���� ���
			System.out.print("�����= " + input +", ��ǻ��= " + option[n]);
			// if - ��ǻ�Ͱ� ������ ���
				//������� �Է¿� ���� ������ ���� ���
			if(n==0) {
				if(input.equals("����"))
					System.out.print(", �����ϴ�.\n");
				else if(input.equals("����"))
					System.out.print(", ����ڰ� �̰���ϴ�.\n");
				else
					System.out.print(", ��ǻ�Ͱ� �̰���ϴ�.\n");}
			// else if - ��ǻ�Ͱ� ������ ���
				//������� �Է¿� ���� ������ ���� ���
			else if(n==1) {
				if(input.equals("����"))
					System.out.print(", ��ǻ�Ͱ� �̰���ϴ�.\n");
				else if(input.equals("����"))
					System.out.print(", �����ϴ�.\n");
				else
					System.out.print(", ����ڰ� �̰���ϴ�.\n");}
			
			// else - ��ǻ�Ͱ� ���� ���
				//������� �Է¿� ���� ������ ���� ���
			else  {
				if(input.equals("����"))
					System.out.print(", ����ڰ� �̰���ϴ�.\n");
				else if(input.equals("����"))
					System.out.print(", ��ǻ�Ͱ� �̰���ϴ�.\n");
				else
					System.out.print(", �����ϴ�.\n");}
		}

		System.out.println("1711412 ������");
		scan.close();
	}

}
