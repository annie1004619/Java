package hw;

import java.util.Scanner;

class Player {
	// �̸� ���� ����
	private String name;
	// ������ (�Ķ���� : �̸�)
	public Player(String name) {
		this.name= name;
	}

	// getName() �Լ�
	public String getName() {
		return name; 
	}
	
}

public class WordGameApp {
	// Scanner ��ü
	Scanner scan = new Scanner(System.in);
	// Player �迭 ���� --Ŭ���� ��ü���� ����Ҽ� �ְ� ��ü������ ����..
	Player player[]; 
	// ���� �ܾ� �����ϴ� ���� ����(�����ձ� ���۴ܾ�) ex : String currentWord="�ƹ���"
	String currentWord="�ƹ���";
	
	
	// beforSetting() �Լ� ����
	public void beforeSetting() {
		// �����ձ� ���� ���� ... ���
		System.out.print("�����ձ� ������ �����մϴ� ...\n");
		// ���� ���� �ο� ��,���
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int p_size;
		p_size=scan.nextInt();
		
		// Player �迭 ����
		player = new Player[p_size];
		// �Է¹��� �ο� �� ��ŭ �̸� �Է� ���� ���� player ���� ���� -> ������ �̿�
		for(int i=0;i<p_size;i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name =scan.next();
			player[i] = new Player(name);}
			//�������� ���� �ޱ⶧���� ��ü ������ ����ٰ� �ؾ��� 
		System.out.print("�����ϴ� �ܾ�� �ƹ����Դϴ�.\n");
		
	}
	
	// start �Լ� ����
	public void start() {
		// ���� ��츦 ��Ÿ���� boolean ����(lose)
		boolean lose = false; //�����ʾ������� false 
		while(true) {
			// player �� �����ư��鼭 ����
			for(int i=0;i<player.length;i++) {
				// getName ����Ͽ� ���� �̸� ���
			System.out.print(player[i].getName()+">>");
				// �ܾ� �Է�
			String inputWord = scan.next();
				// if(...) --> ���� �ܾ�� �Է� ���� �ܾ��� ù���ڿ� �������� -> substring() ���
					//substring(1,2) �ȳ��ϼ��� �ε��� �� ����� �ΰ� ���� ���� 
					//substring(2) ����� ������ 
					if( (currentWord.substring(currentWord.length()-1)).equals(inputWord.substring(0,1)) )
					{
					// �����ϴٸ� ���� �ܾ �Է¹��� �ܾ�� ����
							currentWord= inputWord;}
					
					else {
					// �����ϴ�. ���
						System.out.print(player[i].getName()+"��(��) �����ϴ�.");
					// lose �� true �� ����
					lose = true;
					// for ����������
					break;}
			}
					
			// lose �� true �̸�  while loop break��  scanner �ݱ�
			if (lose) {
				scan.close();
				break; //���Ϲ� break
			}
			
		}
	
	}
	
	public static void main(String[] args) {
		WordGameApp wordGameApp = new WordGameApp();
		wordGameApp.beforeSetting();
		wordGameApp.start();
		
		System.out.println("\n1711412 ������");
	}

}
