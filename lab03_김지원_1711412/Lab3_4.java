package hw;

import java.util.Scanner;

// for( char i='a'; i<='z'; i++)
public class Lab3_4 {
	public static void main(String[] args) {
		//Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		//��� ("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ")
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ");
		//scan.next()�� ����Ͽ� ���ڿ� �Է¹ޱ�
		String string= scan.next();
		//string.charAt(0)�� ����Ͽ� ���ڿ��� ù ��° ����(�ҹ��� ���ĺ� �ϳ�)�� ������ ����
		char c;
		c = string.charAt(0);
		//if�� - string ���̰� 1�� �ƴϸ�
		if(string.length() != 1)
			//��� ("���ĺ� �ϳ��� �Է��ؾ� �մϴ�!")
			System.out.print("���ĺ� �ϳ��� �Է��ؾ� �մϴ�!");
		else
			if (Character.isLowerCase(c))//- character�� ���ĺ� �ҹ������� Ȯ��
				//2�� for���� ���ؼ� ������ ���� ���
				for(char i = c;i >='a'; i--) {
					for(char j = 'a'; j<=i; j++) {
						System.out.print(j);}
					System.out.println(" ");}
					
			else 
				//��� ("�ҹ��� ���ĺ��� �ƴմϴ�.")
				System.out.print("�ҹ��� ���ĺ��� �ƴմϴ�.");
		
		System.out.println("\n1711412 ������");
		//Scanner ��ü �ݱ�
		scan.close();
		
	}
}
