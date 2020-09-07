import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyChangerCheckBoxFrame extends JFrame {

	public MoneyChangerCheckBoxFrame() {
		// 학번 이름 - 클래스 제목으로 타이틀 설정
		super("1711412 김지원-MoneyChangerCheckBoxFrame");
		//MyPanel 생성자를 사용하여 ContentPane 설정
		add(new MyPanel());
		// 창 크기 400, 300
		setSize(400,300);
		// defaultCloseOperation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible 설정
		setVisible(true);
	}

	class MyPanel extends JPanel {
		// 50000 ~ 1 원으로 구성된 int 배열 하나 생성
		private int[] unit = {50000,10000,1000,500,100,50,10,1};
		// "오만원" ~ "1원" 으로 구성된 String 배열 하나 생성
		private String[] str= {"오만원","만원","천원","500원","100원","50원","10원","1원"};
		// JCheckBox 배열 생성 (크기는 위 배열의 길이만큼)
		private JCheckBox[] cb = new JCheckBox[unit.length];
		// JTextField 배열 생성 (크기는 위와 동일)
		private JTextField[] tf = new JTextField[unit.length];

		public MyPanel() {
			// 배경색을 PINK 로 설정 (디폴트 색생 빼고 다른 색으로 정의 가능)
			setBackground(Color.PINK);
			// 판넬 하나 생성
			JPanel jp = new JPanel();
			// 판넬 색상을 위 정의한 색상과 동일하게 설정
			jp.setBackground(Color.PINK);
			// "금액" 라벨을 가지는 라벨 하나 생성
			JLabel jl = new JLabel("금액");
			// 15크기의 텍스트필드 하나 생성 (금액)
			JTextField result = new JTextField(15); ;//생성도 해야함
			// "계산" 라벨을 가지는 버튼 하나 생성
			JButton btn = new JButton("계산");;
			// 판넬에 라벨, 텍스트필드, 버튼 순서대로 붙이기
			jp.add(jl); jp.add(result); jp.add(btn);
			// 판넬 붙이기
			add(jp);
			
			// 센터 판넬 하나 생성
			JPanel jp2 = new JPanel();
			// 센터 판넬의 레이아웃 설정 - GridLayout (row, col) : hint) 위 배열의 길이가 행의 갯수이고, 컬럼의 경우 라벨, 텍스트필드, 콤보박스가 들어간다.
			jp2.setLayout(new GridLayout(unit.length,3));
			// 센터 판넬의 배경색 설정 (위 정의한 색상과 동일하게 설정)
			jp2.setBackground(Color.PINK);
			
			// 배열(클래스의 처음에 정의해준) 의 길이만큼 돌면서
			for(int i=0;i<unit.length;i++) {
				// 라벨을 String 배열의 값을 하나씩 받아오면서 설정
				JLabel label = new JLabel(str[i]);
				// 위 텍스트필드 배열에서 각각의 인덱스에 크기 10인 텍스트 필드를 생성
				tf[i] = new JTextField(10);
				// 위 콤보박스 배열에서 각각의 인덱스에 체크 박스 생성 ("", false)
				cb[i]=new JCheckBox("",false);
				// 콤보 박스의 opaque 를 false로 설정
				cb[i].setOpaque(false);//트루일때랑 펄스일때랑 비교해보기
				// 센터 판넬에 라벨, 텍스트 필드, 콤보박스를 순서대로 추가
				jp2.add(label);jp2.add(tf[i]); jp2.add(cb[i]);
			}
			// 센터 판넬 추가
			add(jp2);
			// "클릭" 버튼에 ActionListener 추가
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = result.getText();
					if(str.length()==0)
						return;
					int money = Integer.parseInt(str);
					for(int i=0;i<unit.length;i++) {
						if(i==unit.length-1) {
							tf[i].setText(Integer.toString(money));	
							break;}
					if(!cb[i].isSelected()) {
						tf[i].setText("0");
						continue;
					}
					tf[i].setText(Integer.toString(money/unit[i]));
					money %= unit[i];
					}
				}
			});
				
		}
	}

	public static void main(String[] args) {
		new MoneyChangerCheckBoxFrame();
	}

}
