import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PhoneBookReader {

	public static void main(String[] args) {
		// File 생성 - 파일 정보 : "C:/classJava/1900000_JAVA/lab08/phone.txt"
		File file = new File("C:/classJava/1711412_JAVA/lab08/phone.txt");
		// FileReader 선언 init:null
		FileReader fr = null;
		// 문자를 읽어올 변수
		int c;
		try {
			// FileReader 사용해서 file 읽어오기
			fr = new FileReader(file);
			// while ... fileReader 에서 읽어온 값 (read) 이 != -1
			while( (c = fr.read()) != -1) 
				// 화면에 출력 (int to char)
				System.out.print((char)c);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// fileReader != null --> fileReader.close() with try&catch
			if( fr != null) {
				try {
					fr.close();
				}catch(IOException e) {
			}
			
			
		}
	}
		System.out.print("\n1711412 김지원");
}
}
