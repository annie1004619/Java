package hw;

import java.util.Scanner;

class Player {
	// 이름 변수 선언
	private String name;
	// 생성자 (파라미터 : 이름)
	public Player(String name) {
		this.name= name;
	}

	// getName() 함수
	public String getName() {
		return name; 
	}
	
}

public class WordGameApp {
	// Scanner 객체
	Scanner scan = new Scanner(System.in);
	// Player 배열 선언 --클래스 전체에서 사용할수 있게 전체적으로 선언..
	Player player[]; 
	// 현재 단어 저장하는 변수 선언(끝말잇기 시작단어) ex : String currentWord="아버지"
	String currentWord="아버지";
	
	
	// beforSetting() 함수 선언
	public void beforeSetting() {
		// 끝말잇기 게임 시작 ... 출력
		System.out.print("끝말잇기 게임을 시작합니다 ...\n");
		// 게임 참가 인원 입,출력
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int p_size;
		p_size=scan.nextInt();
		
		// Player 배열 선언
		player = new Player[p_size];
		// 입력받은 인원 수 만큼 이름 입력 받은 다음 player 정보 세팅 -> 생성자 이용
		for(int i=0;i<p_size;i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name =scan.next();
			player[i] = new Player(name);}
			//위에서는 선언만 햇기때문에 객체 생성은 여기다가 해야함 
		System.out.print("시작하는 단어는 아버지입니다.\n");
		
	}
	
	// start 함수 선언
	public void start() {
		// 졌을 경우를 나타내는 boolean 변수(lose)
		boolean lose = false; //지지않앗을때로 false 
		while(true) {
			// player 를 번갈아가면서 수행
			for(int i=0;i<player.length;i++) {
				// getName 사용하여 선수 이름 출력
			System.out.print(player[i].getName()+">>");
				// 단어 입력
			String inputWord = scan.next();
				// if(...) --> 현재 단어와 입력 받은 단어의 첫글자와 동일한지 -> substring() 사용
					//substring(1,2) 안녕하세요 인덱스 일 녕부터 두개 녕하 리턴 
					//substring(2) 녕부터 끝까지 
					if( (currentWord.substring(currentWord.length()-1)).equals(inputWord.substring(0,1)) )
					{
					// 동일하다면 현재 단어를 입력받은 단어로 변경
							currentWord= inputWord;}
					
					else {
					// 졌습니다. 출력
						System.out.print(player[i].getName()+"이(가) 졌습니다.");
					// lose 를 true 로 변경
					lose = true;
					// for 빠져나가기
					break;}
			}
					
			// lose 가 true 이면  while loop break과  scanner 닫기
			if (lose) {
				scan.close();
				break; //와일문 break
			}
			
		}
	
	}
	
	public static void main(String[] args) {
		WordGameApp wordGameApp = new WordGameApp();
		wordGameApp.beforeSetting();
		wordGameApp.start();
		
		System.out.println("\n1711412 김지원");
	}

}
