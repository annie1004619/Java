package hw;

import java.util.Scanner;

class Phone {
	// 이름, 전화번호 필드
	private String name, tel;
	// 생성자 (파라미터 : 이름, 전화번호)
	public Phone(String name, String tel) {
		this.name= name;
		this.tel=tel;
	}
	
	// get 함수 정의 (2개 : 이름, 전화번호 각각) - getName(), getTel()
	public String getName() {
		return name; 
	}
	
	public String getTel() {
		return tel;
	}
	
	
}

public class PhoneBook {
	// Scanner 객체 선언
	Scanner scan = new Scanner(System.in);
	// Phone 배열 선언
	Phone phone[];
	// input 함수
	private void input() {
		// 인원수 입,출력
		int p_size;
		System.out.print("인원수>>");
		p_size=scan.nextInt();
		// 인원수만큼의 Phone 배열 선언
		phone = new Phone[p_size];
		// 인원수만큼의 이름과 전화번호 입력받기
		for(int i=0;i<p_size;i++) {
			//이름과 전화번호 입력받기
		System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
		String name, tel;
		name=scan.next();
		tel=scan.next();
		phone[i] = new Phone(name, tel);
		}
		System.out.print("저장되었습니다...\n")	;
		// 저장되었습니다... 출력
	}

	// search 함수
	private void search(String searchName) {
		// phone 배열 길이만큼 돌면서 해당 이름이 있는지 확인 후 출력
		String name=searchName;
		int j=0;
		int x=0;
		for(int i=0; i<phone.length;i++) {
			
			if(name.equals(phone[i].getName()) ) {
				j++;
				x=i;}
		}
			// 이름이 있으면 '이름' + "의 전화번호는" + '전화번호'+"입니다."
		//이름과 전화번호 getname gettel 로 받아오면 됨
		if(j>0)
			System.out.print(phone[x].getName()+"의 전화번호는 "+phone[x].getTel()+"입니다.\n");
		// 이름이 없으면 '이름' + "이(가) 없습니다."
		else
			System.out.print(name+"이(가) 없습니다.\n");
	}

		
	public void runCommand() {
		input();
		while (true) {
			// 검색할 이름 입력
			System.out.print("검색할 이름>>");
			String name = scan.next();
			// 입력한 단어가 "그만" 인지 확인
			if(name.equals("그만")) {
			// "그만" 인 경우 종료
				scan.close();
				break;}
			else
				search(name);
				
			// 아닌 경우, search(searchName) 함수 실행
			
			
		}
	}


	public static void main(String[] args) {
		PhoneBook phonebook = new PhoneBook();
		phonebook.runCommand();
		System.out.println("1711412 김지원");
	}
}

