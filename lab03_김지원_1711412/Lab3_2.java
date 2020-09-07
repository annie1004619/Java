package hw;
public class Lab3_2 {
	public static void main(String[] args) {
		// 2차원 배열 초기화 : { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } }
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };
		//arr.length 배열의 길이 n[4].length
		// 2중 for문 및 배열의 길이를 사용하여 출력 
			// 출력 : (n[i][j] + "\t")
			// new line에 유의
		for(int i=0;i<5;i++) {
			for(int j =0; j<n[i].length;j++) {
				System.out.print(n[i][j] + "\t");}
			System.out.println(" ");}
		System.out.println("\n1711412 김지원");
	}
}