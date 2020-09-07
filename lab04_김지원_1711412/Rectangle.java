package hw;
public class Rectangle {
	// private 변수 - int 타입의 x, y, width, height
	private int x, y, width, height;
	// x, y, width, height 값을 매개변수로 받아 필드를 초기화 하는 생성자
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	
	
	public int square() {//: 메소드 - 사각형의 넓이 리턴
		int area;
		area = width*height;
		return area;
	}
	
	
	 void show() { //: 메소드 -   사각형의 좌표와 넓이를 화면에 출력 출력형태 피피티 참고
	 System.out.print("(" + x +","+ y + ")에서 크기가 " + width + "x" + height+"인 사각형\n");
	 }
	
	boolean contains(Rectangle r) {  //: 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴  *딱 접해도 true 아님 r의 x는 r.x r.y 
	//r.x > x r.y < y  x+width > r.x+r.width y+height > r.y+r.height &&로 묶기
		return((r.x>x)&&(r.y>y)&&((r.x+r.width)<(x+width))&&((r.y+r.height)<(y+height))); 
		}
	//if()이렇게 하지말고 return(--)그 자체를 리턴을 하기
	
	
	public static void main(String[] args) {
		// 실습 자료의 메인 함수와 동일
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은" + s.square());
		if(t.contains(r))
			System.out.println("t는 r를 포함합니다.");
		if(t.contains(s))
			System.out.println("t는 s를 포함합니다.");
		
		System.out.println("\n1711412 김지원");
	}

}
