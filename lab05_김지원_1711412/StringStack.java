public class StringStack implements Stack {
	// String 저장 배열 - 선언 > 스택 저장 공간
	 private String[] element;//배열 만든거 아니고 선언만 한거임
	// index, top of stack 선언
	private int tos;
	
	// 생성자 -> 매개변수는 stack capacity
	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1;
	}
	
	// Stack 인터페이스에 선언된 다음 4개의 메소드 오버라이딩 구현
	
	// 현재 스택에 저장된 개수 리턴하는 메소드
	@Override
	public int length() {
		return tos+1;
	}
	
	// 스택 capacity 리턴
	@Override
	public int capacity() {
		return element.length;  //length 배열의 속성 Stirng -> length() 스트링의 메소드 
	}

	// pop 메소드 구현 - 스택 비었을 때 처리
	@Override
	public String pop() {
		if(tos == -1)
			return null;
		else {
			String s = element[tos];
			tos--;
			return s;
		}
	}

	// push 메소드 구현 - 스택이 꽉 찼을 때 처리
	@Override
	public boolean push(String str) {
		//꽉 찼을때
		if(tos == element.length-1)
			return false;
			
		//push 성공했을 떼
		else {
			tos++;
			element[tos]=str;
			return true;}
	}
	
	
	
	
}