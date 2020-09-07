package hw;

import java.util.Scanner;

class Circle{
	// double 형 x, y 변수
	double x, y;
	// 반지름 변수
	int r;
	
	// Circle 생성자 (파라미터 - x, y, 반지름)
	public Circle(double x, double y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	
	// show 함수 ()
	public String show() {
		
		return("(" + x + "," + y +") " + r);
	}
	
	public int getArea(){ //함수 : 면적 구하는 함수 추가 정의 파이  생략을 하고 알곱하기 알 
	int size;
	size= r*r;
	return size;
	}
}
	
public class CircleManager {

	public static void main(String[] args) {
		// Scanner 객체 선언
		Scanner scan = new Scanner(System.in);
		// 3개의 Circle 배열 선언
		Circle c[] = new Circle[3];
		//생성은 안했고 선언만 함 
		
		// 가장 큰 면적을 저장할 변수
		int max;
		// 가장 큰 면적을 가지는 객체의 index를 저장할 변수
		int maxidx=0;
		
		for(int i = 0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
		
			// x 값 읽기
			double x;
			x=scan.nextDouble();
			// y 값 읽기
			double y;
			y=scan.nextDouble();
			// 반지름 읽기
			int r;
			r=scan.nextInt();
			// c[i] = ... //  Circle 객체 생성(hint : 생성자)
			c[i] = new Circle(x, y, r);
		}
		
		
		
		for(int i = 0; i<c.length; i++) {
			//  getArea()메소드 사용하여 면적이 최대값인지 확인 후 max/maxidx update 
			max=c[0].getArea();
			if(max<c[i].getArea()) {
				max=c[i].getArea();
				maxidx=i; }
		}
		
		// 실행결과 참고 - show() 함수와 getArea()함수 사용하여 출력
			System.out.print("가장 면적이 큰 원은 " + c[maxidx].show()+"이며, 면적은"+ c[maxidx].getArea()+"입니다");
		// Scanner 닫기
			System.out.println("\n1711412 김지원");
		scan.close();
	}

}
