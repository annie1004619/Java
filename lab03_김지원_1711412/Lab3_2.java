package hw;
public class Lab3_2 {
	public static void main(String[] args) {
		// 2���� �迭 �ʱ�ȭ : { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } }
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };
		//arr.length �迭�� ���� n[4].length
		// 2�� for�� �� �迭�� ���̸� ����Ͽ� ��� 
			// ��� : (n[i][j] + "\t")
			// new line�� ����
		for(int i=0;i<5;i++) {
			for(int j =0; j<n[i].length;j++) {
				System.out.print(n[i][j] + "\t");}
			System.out.println(" ");}
		System.out.println("\n1711412 ������");
	}
}