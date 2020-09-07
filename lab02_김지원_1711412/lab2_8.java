package hw;

import java.util.Scanner;

public class lab2_8 {
	public static void main(String[] args) {
		// Scanner 객체 생성 **xl이 x2보다 클수도 있음 네군데로 나눠서 생각해보기 x1이 x2가 백보다 작아야함
		Scanner scan = new Scanner(System.in);
		// 출력 ("x1, y1 입력 >> ")
		System.out.print("x1, y1 입력 >> ");
		// x1, y1 입력
		int x1, y1;
		x1 = scan.nextInt();
		y1= scan.nextInt();
		// 출력 ("x2, y2 입력 >> ")
		System.out.print("x2, y2 입력 >> ");
		// x2, y2 입력
		int x2, y2;
		x2 = scan.nextInt();
		y2= scan.nextInt();
		if(((x1<100)&&(x2<100))||((y1<100)&&(y2<100))||((x1>200)&&(x2>200))||((y1>200)&&(y2>200))) // (x1, y1)과 (x2, y2)가 (100,100),(200,200)과 만나지 않는 경우
		//출력 ("충돌 없음")	
			System.out.print("충돌 없음");
		else
		// 출력 ("충돌 발생")
			System.out.print("충돌 발생");
		// scanner 닫기
		System.out.println("\n1711412 김지원");
			scan.close();
	}
}
