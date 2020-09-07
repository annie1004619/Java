package hw;

import java.util.Scanner;

public class Lab3_16 {
// if else if 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		//  { "가위", "바위", "보" } 로 문자열 배열 만들기
		String option[] = { "가위", "바위", "보" };
		// 무한 반복
		while(true) {
			// 출력 ("컴퓨터와 가위바위보 게임을 합니다")
			System.out.println("컴퓨터와 가위바위보 게임을 합니다");
			// 출력 ("가위 바위 보!>> ")
			System.out.print("가위 바위 보!>> ");
			// 사용자로부터 String 입력 받기
			String input;
			input = scan.next();
			// 사용자가 "그만"을 입력했으면
				// 게임 끝 (반복문 끝)
			if(input.equals("그만"))
				break;
				
			// 컴퓨터가 내는 것을 랜덤하게 선택하기 위해 0~2의 난수 생성
			int n;
			n = (int)(Math.random()*3);
			// 사용자의 선택과 컴퓨터의 선택 출력
			System.out.print("사용자= " + input +", 컴퓨터= " + option[n]);
			// if - 컴퓨터가 가위인 경우
				//사용자의 입력에 따라 게임의 승자 출력
			if(n==0) {
				if(input.equals("가위"))
					System.out.print(", 비겼습니다.\n");
				else if(input.equals("바위"))
					System.out.print(", 사용자가 이겼습니다.\n");
				else
					System.out.print(", 컴퓨터가 이겼습니다.\n");}
			// else if - 컴퓨터가 바위인 경우
				//사용자의 입력에 따라 게임의 승자 출력
			else if(n==1) {
				if(input.equals("가위"))
					System.out.print(", 컴퓨터가 이겼습니다.\n");
				else if(input.equals("바위"))
					System.out.print(", 비겼습니다.\n");
				else
					System.out.print(", 사용자가 이겼습니다.\n");}
			
			// else - 컴퓨터가 보인 경우
				//사용자의 입력에 따라 게임의 승자 출력
			else  {
				if(input.equals("가위"))
					System.out.print(", 사용자가 이겼습니다.\n");
				else if(input.equals("바위"))
					System.out.print(", 컴퓨터가 이겼습니다.\n");
				else
					System.out.print(", 비겼습니다.\n");}
		}

		System.out.println("1711412 김지원");
		scan.close();
	}

}
