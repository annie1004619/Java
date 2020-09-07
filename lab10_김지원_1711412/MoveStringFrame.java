import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveStringFrame extends JFrame {
	public MoveStringFrame() {
		// title 설정
		super("1711412 김지원 -MoveStringFrame");
		// Panel 생성
		JPanel jp = new JPanel();
		// Label 생성 - default "Love Java"
		JLabel jl = new JLabel("Love Java");
		// panel 에 label 붙이기
		jp.add(jl);
		// label 에 keyListener 추가 (param - KeyAdapter())
		jl.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					JLabel label = (JLabel)e.getSource();
					String text = label.getText();
					String first = text.substring(0,1);
					String last = text.substring(1);
					jl.setText(last+first);
					}
			}
		});
		// 1. keyPressed (KeyEvent e)
			// e.getKeyCode() == 방향키 왼쪽 (VK_LEFT) 일 경우,
			// label = e.getSource 받아오기
			// label text 가져오기
			// 첫글자, 나머지 글자 나누기
			// label setText
			
		// label setFocusable(true) 설정
		jl.setFocusable(true);
		// requestFocus 설정
		jl.requestFocus();
		// Panel 추가
		add(jp);
		
		// size 400 * 200
		setSize(400,200);
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible true
		setVisible(true);
	}

	public static void main(String[] args) {
		new MoveStringFrame();
	}

}
