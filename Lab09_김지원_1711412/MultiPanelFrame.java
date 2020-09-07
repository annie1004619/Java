import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MultiPanelFrame extends JFrame { // JFrame 상속
	Random random = new Random();
	
	public JPanel getNorthPanel() {
//		 JPanel 생성
		JPanel jp = new JPanel();
//		  north panel 에 존재하는 버튼 3개 생성(열기, 닫기, 나가기)
		JButton jb1 = new JButton("열기");
		JButton jb2 = new JButton("닫기");
		JButton jb3 = new JButton("나가기");
		
		
//		  panel 에 붙이기
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
//		  panel return
		return jp;
		 
	}
	
	public JPanel getSouthPanel() {
//		 JPanel 생성
		JPanel jp = new JPanel();
//		 button 생성 - "Word Input"
		JButton jb = new JButton("Word Input");
//		 size 15인 textField 생성
		JTextField jf = new JTextField(15);
//		 panel 에 button, tf 붙이기 
		jp.add(jb);
		jp.add(jf);
//		 panel return
		return jp;

	}
	
	public int getRandomLocation() {
		return random.nextInt(300);
		// random 한 값 ~300
	}
	
	public JPanel getCenterPanel() {
//		 JPanel 생성
		JPanel jp = new JPanel();
//		 layout null 로 설정
		jp.setLayout(null);
//		 배경색 흰색으로 설정
		jp.setBackground(Color.white);
//		 size 5 인 JLabel list 생성
		 JLabel jl[] = new JLabel[5];
//		 jlabel length for loop....
		 for(int i =0;i<jl.length;i++) {
//		 	각 요소 별 JLabel 생성 "*"
		jl[i] = new JLabel("*");
//		 	fontcolor - setForegroud 함수 사용
		jl[i].setForeground(Color.red);
//		 	size 10*10
		jl[i].setSize(10,10);
//		 	location 설정 - getRandomLocation 호출
		jl[i].setLocation(getRandomLocation(), getRandomLocation());
//		 	panel 에 label 붙이기
		jp.add(jl[i]);
		 }
//		 return panel 
		 return jp;
	}
	
	public MultiPanelFrame() {
		
//		 	부모 생성자 호출, parameter : 학번 + 이름 + 클래스 이름;
		super("1711412 김지원 - MultiPanelFrame");
//		 	DefaultCloseOperation- JFrame.EXIT_ON_CLOSE
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		 	panel 하나 생성
		JPanel jp = new JPanel();
//		 	BorderLayout 으로 설정
		jp.setLayout(new BorderLayout());
//		 	각 위치 별 panel 붙이기(함수 호출 getNorth...)
		jp.add(getNorthPanel(),BorderLayout.NORTH);
		jp.add(getSouthPanel(),BorderLayout.SOUTH);
		jp.add(getCenterPanel(),BorderLayout.CENTER);
		
		
//		 	panel 붙이기
		add(jp);	
		
//		 	visible 설정
		setVisible(true);
//		 	size 300*300 
		setSize(300,300);
	}

	public static void main(String[] args) {
		new MultiPanelFrame();
	}

}
