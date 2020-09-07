package hw;

import java.util.Scanner;

public class lab2_6 {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 출력 ("1~99 사이의 정수를 입력하시오 >> ")
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		// 정수 입력
		int num, num_10, num_1;
		num = scan.nextInt();
		// 십의 자리, 일의 자리 수 각각 구하기
		num_10 = num/10;
		num_1 = num%10;
		
		if (((num_10==3)||(num_10==6)||(num_10==9))&&((num_1==3)||(num_1==6)||(num_1==9))) // 십의 자리, 일의 자리 모두 3, 6, 9 중 하나 ** 앤드 연산 사용 아래 엘스랑 순서 바뀌면 안됨
		// 출력 ("박수 짝짝")
			System.out.print("박수 짝짝");
		else if(((num_10==3)||(num_10==6)||(num_10==9))||((num_1==3)||(num_1==6)||(num_1==9))) // 십의 자리, 일의 자리 중 하나가 3, 6, 9 중 하나
		// 출력 ("박수 짝")
			System.out.print("박수 짝");
		else
		// 출력 ("박수 없음")
			System.out.print("박수 없음");
		// scanner 닫기
		System.out.println("\n1711412 김지원");
			scan.close();
	}
}
