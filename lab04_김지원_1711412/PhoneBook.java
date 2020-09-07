package hw;

import java.util.Scanner;

class Phone {
	// �̸�, ��ȭ��ȣ �ʵ�
	private String name, tel;
	// ������ (�Ķ���� : �̸�, ��ȭ��ȣ)
	public Phone(String name, String tel) {
		this.name= name;
		this.tel=tel;
	}
	
	// get �Լ� ���� (2�� : �̸�, ��ȭ��ȣ ����) - getName(), getTel()
	public String getName() {
		return name; 
	}
	
	public String getTel() {
		return tel;
	}
	
	
}

public class PhoneBook {
	// Scanner ��ü ����
	Scanner scan = new Scanner(System.in);
	// Phone �迭 ����
	Phone phone[];
	// input �Լ�
	private void input() {
		// �ο��� ��,���
		int p_size;
		System.out.print("�ο���>>");
		p_size=scan.nextInt();
		// �ο�����ŭ�� Phone �迭 ����
		phone = new Phone[p_size];
		// �ο�����ŭ�� �̸��� ��ȭ��ȣ �Է¹ޱ�
		for(int i=0;i<p_size;i++) {
			//�̸��� ��ȭ��ȣ �Է¹ޱ�
		System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
		String name, tel;
		name=scan.next();
		tel=scan.next();
		phone[i] = new Phone(name, tel);
		}
		System.out.print("����Ǿ����ϴ�...\n")	;
		// ����Ǿ����ϴ�... ���
	}

	// search �Լ�
	private void search(String searchName) {
		// phone �迭 ���̸�ŭ ���鼭 �ش� �̸��� �ִ��� Ȯ�� �� ���
		String name=searchName;
		int j=0;
		int x=0;
		for(int i=0; i<phone.length;i++) {
			
			if(name.equals(phone[i].getName()) ) {
				j++;
				x=i;}
		}
			// �̸��� ������ '�̸�' + "�� ��ȭ��ȣ��" + '��ȭ��ȣ'+"�Դϴ�."
		//�̸��� ��ȭ��ȣ getname gettel �� �޾ƿ��� ��
		if(j>0)
			System.out.print(phone[x].getName()+"�� ��ȭ��ȣ�� "+phone[x].getTel()+"�Դϴ�.\n");
		// �̸��� ������ '�̸�' + "��(��) �����ϴ�."
		else
			System.out.print(name+"��(��) �����ϴ�.\n");
	}

		
	public void runCommand() {
		input();
		while (true) {
			// �˻��� �̸� �Է�
			System.out.print("�˻��� �̸�>>");
			String name = scan.next();
			// �Է��� �ܾ "�׸�" ���� Ȯ��
			if(name.equals("�׸�")) {
			// "�׸�" �� ��� ����
				scan.close();
				break;}
			else
				search(name);
				
			// �ƴ� ���, search(searchName) �Լ� ����
			
			
		}
	}


	public static void main(String[] args) {
		PhoneBook phonebook = new PhoneBook();
		phonebook.runCommand();
		System.out.println("1711412 ������");
	}
}

