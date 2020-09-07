import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseWheelFrame extends JFrame {
	public MouseWheelFrame() {
		// title 설정 (학번 이름 - 클래스 이름)
		super("1711412 김지원 - MouseWheelFrame");
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 배치관리자 설정 -FlowLayout
		setLayout(new FlowLayout());
		// "Love Java" 텍스트 라벨
		JLabel jl = new JLabel("LOVE JAVA");
		// add label
		add(jl);
		// "Arial", plain, 15 픽셀 크기
		jl.setFont(new Font("Arial", Font.PLAIN, 15));
		// 라벨에  mouseWheelListener 추가 및 익명 클래스 정의
		jl.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if(n<0) {
					JLabel label = (JLabel)e.getSource();
					Font f = label.getFont();
					int size = f.getSize();
					if(size<=5) {
						return;
					}
					label.setFont(new Font("Arial", Font.PLAIN,size-5));
				}
				else {
					JLabel label = (JLabel)e.getSource();
					Font f = label.getFont();
					int size = f.getSize();
					label.setFont(new Font("Arial", Font.PLAIN, size+5));
				}
			}
		});
			// mouseWheelMoved(MouseWheelEvent e)
			
				// e.getWheelRotation() 으로 휠의 움직임 가져오기
				
				// 가져온 움직임이 0보다 작다면 -> 위로 휠 움직임
				
					// e.getSource로 이벤트 발생한 JLabel 가져오기
					
					// label의 font 가져오기 - getFont()
					
					// font 에 대해 size 가져오기 - getSize()
					
					// 5픽셀 이하로 작아지지 않도록 return
				
		
					// 원래보다 5픽셀 작아지도록 설정
					
		
				// 가져온 움직임이 0보다 작다면 -> 아래ㅗ 휠 움직임
				
					// e.getSource로 이벤트 발생한 JLabel 가져오기
				
					// label의 font 가져오기 - getFont()
				
					// font 에 대해 size 가져오기 - getSize()
				
					// 원래보다 5픽셀 커지도록 설정
					
				
			
		
		// size 300*150
		setSize(300,150);
		// visible true
		setVisible(true);
		
	}
	
	static public void main(String [] args) {
		new MouseWheelFrame();
	}
}
