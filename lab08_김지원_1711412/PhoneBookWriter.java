import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;


public class PhoneBookWriter {

	public static void main(String[] args) {
		// Scanner 객체 선언
		Scanner scan = new Scanner(System.in);
				
		// File 생성 - "C:/classJava/1900000_JAVA/lab08/phone.txt"
		File file = new File("C:/classJava/1711412_JAVA/lab08/phone.txt");
		// FileWriter 선언 -init:null
		FileWriter fw = null;
		try {
			// 출력 "전화번호 입력 프로그램입니다."
			System.out.println("전화번호 입력 프로그램입니다.");
			// fileWriter 사용해서 file 읽어오기
			fw = new FileWriter(file);
			// while(true){
			while(true) {
			// 출력 "이름 전화번호 >>"
			System.out.print( "이름 전화번호 >>");
			// 입력 받기
			String str = scan.nextLine();
			// 입력 값 == "그만" --> break;
			if(str.contentEquals("그만"))
				break;
			// fileWriter에 받아온 값 + "\n" 쓰기
			fw.write(str+"\n");
			
			}
			
			// 출력 "C:/classJava/1900000_JAVA/lab08/phone.txt 에 저장하였습니다."
			System.out.println("C:/classJava/1711412_JAVA/lab08/phone.txt 에 저장하였습니다.");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// fileWriter != null --> fileWriter.close() & Scanner close()  with try&catch
			if(fw != null) {
				try { 
					fw.close();
				scan.close();
				} catch(IOException e) {} 

			}
		}
		
		System.out.print("\n1711412 김지원");
	}

}
