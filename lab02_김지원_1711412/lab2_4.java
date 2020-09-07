package hw;

import java.util.Scanner;

public class lab2_4 {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 출력 ("정수 3개 입력 >> ")
		System.out.print("정수 3개 입력 >> ");
		// 숫자 세개 입력 받기
		int a,b,c;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		// 중간 값 mid 구하기 -> Math.max, Math.min 사용해서
		int max = Math.max(Math.max(a,b),c);
		int min = Math.min(Math.min(a, b), c);
		int mid = a+b+c -max -min;
		// 출력 ("중간 값은 " + mid)
		System.out.print("중간 값은 " + mid);
		// scanner 닫기
		System.out.println("\n1711412 김지원");
		scan.close();
	}
}
