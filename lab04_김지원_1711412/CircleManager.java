package hw;

import java.util.Scanner;

class Circle{
	// double �� x, y ����
	double x, y;
	// ������ ����
	int r;
	
	// Circle ������ (�Ķ���� - x, y, ������)
	public Circle(double x, double y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	
	// show �Լ� ()
	public String show() {
		
		return("(" + x + "," + y +") " + r);
	}
	
	public int getArea(){ //�Լ� : ���� ���ϴ� �Լ� �߰� ���� ����  ������ �ϰ� �˰��ϱ� �� 
	int size;
	size= r*r;
	return size;
	}
}
	
public class CircleManager {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// 3���� Circle �迭 ����
		Circle c[] = new Circle[3];
		//������ ���߰� ���� �� 
		
		// ���� ū ������ ������ ����
		int max;
		// ���� ū ������ ������ ��ü�� index�� ������ ����
		int maxidx=0;
		
		for(int i = 0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
		
			// x �� �б�
			double x;
			x=scan.nextDouble();
			// y �� �б�
			double y;
			y=scan.nextDouble();
			// ������ �б�
			int r;
			r=scan.nextInt();
			// c[i] = ... //  Circle ��ü ����(hint : ������)
			c[i] = new Circle(x, y, r);
		}
		
		
		
		for(int i = 0; i<c.length; i++) {
			//  getArea()�޼ҵ� ����Ͽ� ������ �ִ밪���� Ȯ�� �� max/maxidx update 
			max=c[0].getArea();
			if(max<c[i].getArea()) {
				max=c[i].getArea();
				maxidx=i; }
		}
		
		// ������ ���� - show() �Լ��� getArea()�Լ� ����Ͽ� ���
			System.out.print("���� ������ ū ���� " + c[maxidx].show()+"�̸�, ������"+ c[maxidx].getArea()+"�Դϴ�");
		// Scanner �ݱ�
			System.out.println("\n1711412 ������");
		scan.close();
	}

}
