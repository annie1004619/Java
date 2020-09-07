package hw;
public class Rectangle {
	// private ���� - int Ÿ���� x, y, width, height
	private int x, y, width, height;
	// x, y, width, height ���� �Ű������� �޾� �ʵ带 �ʱ�ȭ �ϴ� ������
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	
	
	public int square() {//: �޼ҵ� - �簢���� ���� ����
		int area;
		area = width*height;
		return area;
	}
	
	
	 void show() { //: �޼ҵ� -   �簢���� ��ǥ�� ���̸� ȭ�鿡 ��� ������� ����Ƽ ����
	 System.out.print("(" + x +","+ y + ")���� ũ�Ⱑ " + width + "x" + height+"�� �簢��\n");
	 }
	
	boolean contains(Rectangle r) {  //: �Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����  *�� ���ص� true �ƴ� r�� x�� r.x r.y 
	//r.x > x r.y < y  x+width > r.x+r.width y+height > r.y+r.height &&�� ����
		return((r.x>x)&&(r.y>y)&&((r.x+r.width)<(x+width))&&((r.y+r.height)<(y+height))); 
		}
	//if()�̷��� �������� return(--)�� ��ü�� ������ �ϱ�
	
	
	public static void main(String[] args) {
		// �ǽ� �ڷ��� ���� �Լ��� ����
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������" + s.square());
		if(t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");
		
		System.out.println("\n1711412 ������");
	}

}
