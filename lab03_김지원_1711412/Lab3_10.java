package hw;

public class Lab3_10 {
	public static void main(String[] args) {
		// 4 x 4 �迭 ����
		int n[][] = new int[4][4];
		// for������ 10�� �ݺ�
		for(int i=0; i<10;i++) { // i --���� �� ������ 
			// row�� �ش��ϴ� ���� ���� - 0~3 math *4 0���� 3�̶�
			int r;
			r = (int)(Math.random()*4);
			// column�� �ش��ϴ� ���� ���� - 0~3
			int c;
			c = (int)(Math.random()*4);
			//�����Ϸ��� ���� 0 ���� �ƴ��� Ȯ���ϱ�
			 if (n[r][c]!=0)     //: 0�� �ƴ϶�� - �̹� 2���� �迭 �ش� row,column�� ���ڰ� �����Ѵٸ�
				 i--;// �ϳ��� iteration �ٽ� �ݺ� 
			 	// ���� - ����ؼ� ���ڰ� �����ϴ� row, column�� ���� �� ������ ����
			 else
				n[r][c] = (int)(Math.random()*10+1);// 1~10 ������ ���� ����
		}
		//2�� for���� ����ؼ� ��� 
			// ��� : n[i][j] + "\t"
			// new line�� ����
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(n[i][j] + "\t");}
			System.out.println(" ");
			
		}
		System.out.println("1711412 ������");
	}
}
