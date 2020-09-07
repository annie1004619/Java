package hw;

import java.util.Scanner;

public class lab2_10 {
	public static void main(String[] args) {
		// Scanner 객체 생성 **출력결과에 이름 학번 
		Scanner scan = new Scanner(System.in);
		// 출력 ("원의 중심 x1, y1, 반지름 radius1 >> ")
		System.out.print("원의 중심 x1, y1, 반지름 radius1 >> ");
		// x1, y1, r1 입력
		int x1, y1, r1;
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		r1 = scan.nextInt();
		// 출력 ("원의 중심 x2, y2, 반지름 radius2 >> ")
		System.out.print ("원의 중심 x2, y2, 반지름 radius2 >> ");
		// x2, y2, r2 입력
		int x2, y2, r2;
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		r2 = scan.nextInt();
		// 두 원의 중심 사이의 거리 구하기
		double distance = Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1),2));
		
		if (distance > r1+r2) // 원이 겹치지 않는 경우 (반지름의 합 등 이용)
		// 출력
			System.out.print("두 원은 서로 겹치지 않는다.");
		else
		// 출력
			System.out.print("두 원은 서로 겹친다.");
		// scanner 닫기
		System.out.println("\n1711412 김지원");
			scan.close();
	}
}
