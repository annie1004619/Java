import java.io.BufferedReader;
   import java.io.File;
   import java.io.FileReader;
   import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
   import java.util.Scanner;

   
   class CreateWords{//랜덤 단어 생성 클래스
      
        public String randomWord() {//word.txt에서 랜덤한 단어를 리턴하는 메소드
            BufferedReader br = null;
            String str = null;
            int n;
            Random random = new Random();

               // File 생성 - 파일 정보 : "C:/classJava/1900000_JAVA/lab08/phone.txt"
               File file = new File("C:/classJava/1711412_JAVA/project/word.txt");
              

               try {
                  // FileReader 사용해서 file 읽어오기
                     br = new BufferedReader(new FileReader(file));
                     n = random.nextInt(25143);//랜덤한 라인번호 생성 (word.txt.마지막 줄수=25143)
                     for(int i=0;i<n-1;i++){
                        br.readLine();
                     }
                     str = br.readLine();//랜덤한 라인의 문자열
                     
               }
                catch (IOException e) {
                  e.printStackTrace();
               } 
               return str;
            }   
   }

   public class Project_김지원_1711412 {
      StringBuffer hiddenWord;//빈칸 단어 저장
      String newRandomWord;//랜덤으로 설정할 단어
      char [] alpabat = new char[26];//알파벳 배열
      boolean check[] = new boolean[26];//입력한 알파벳이 중복인지 확인하기위한 배열
      int fail=0;//실패한 횟수
      Scanner scan = new Scanner(System.in);
      
      public void gameStart() {//게임을 시작하고 계속할지 여부를 물어보는 메소드
         String answer;
         CreateWords words = new CreateWords();
         while(true) {
            newRandomWord = words.randomWord();
         hideWord();
         play();
         fail=0;//게임이 끝난후 실패횟수를 0으로 초기화
         Arrays.fill(check, false);//게임이 끝난후 중복확인 배열을 초기화
         System.out.print("Next(y/n)?");
         answer = scan.next();
         if(answer.equals("n")) 
            break;
         }
      }
    

      public void hideWord() {//숨길 알파벳 설정 후 '-'로 바꿔줌
        
         hiddenWord = new StringBuffer(newRandomWord);//hiddenWord StringBuffer에 랜덤으로 설정된 단어 저장
         int index[]=new int[4];
         
         for(int i=0;i<alpabat.length;i++) {//알파벳 배열에 알파벳 순서대로 저장
            alpabat[i]=(char)('a'+i);
         }
         
         for(int i=0;i<newRandomWord.length();i++) {//알파벳배열에서 맞춰야하는 단어에 해당하는 알파벳 '-'으로 변경
            char c= newRandomWord.charAt(i);
            if((int)c>=97) {
            alpabat[(int)c-97]='-';}//해당하는 소문자 알파벳 유니코드에 97를 빼서 0-25사이의 수로 바꿔 그 숫자에 해당하는 알파벳을 '-'으로 변경
         }
         
         for(int i =0;i<4;i++) {
            index[i]=(int)(Math.random()*newRandomWord.length());//단어길이의 랜덤 인덱스 설정
            char c = newRandomWord.charAt(index[i]);//랜덤 인덱스의 글자를 c에 저장
            
            for(int j=0;j<i;j++) {
               if(newRandomWord.charAt(index[j])==c) {//단어의 index[j번]째 알파벳이 c와 같다면
                  index[i]=(int)(Math.random()*newRandomWord.length());//인덱스 다시 설정
                  c = newRandomWord.charAt(index[i]);//c에 글자 다시 저장
                   j--;//j를 줄여 같은지 다시 확인하게함
               }   
            }
            
            
            for(int p=0;p<newRandomWord.length();p++) {
               if(newRandomWord.charAt(p)==c) {//단어의 p번째 알파벳이 c와 같다면
                  hiddenWord.setCharAt(p, '-');//p번째 알파벳을 '-'로 바꿔줌
               }
            }
          
           if((int)c>=97) {//단어에서 가려진 알파벳은 출력될 알파벳 목록에서 다시 보여줌
               alpabat[(int)c-97]=c;}//해당하는 소문자 알파벳 유니코드에서 97를 빼 0-25사이의 수로 바꿔준다음 그 수를 알파벳 배열 인덱스로 사용
     
         }
      }
      
      void play() {//종료조건이 될때까지 게임 진행
        
         char f_input;//사용자가 입력한 알파벳 한 글자
        
         System.out.println("지금부터 행맨 게임을 시작합니다.");
        do {
            if(fail==5) {
               System.out.println("5번 실패하였습니다.");
               break;
            }

            System.out.println(hiddenWord);
               System.out.println(alpabat);
               System.out.print(">>");
               String input = scan.next();
               f_input = input.charAt(0);
               }while(!result(f_input));
        
               System.out.println(newRandomWord);
               }
               
               
               
         boolean result(char f_input) {//게임의 결과를 리턴해주는 메소드 성공시 true 아니면 false 리턴
            
               boolean success = false;//성공여부 나타내는 변수 
               
               
               for(int i=0;i<newRandomWord.length();i++) {
                  if(hiddenWord.charAt(i)=='-'&&newRandomWord.charAt(i)==f_input) {//i번째 빈칸 맞췄을 때
                     char c = newRandomWord.charAt(i);
                     hiddenWord.setCharAt(i, f_input);//가려진 단어를 맞춘 알파벳으로 변경
                     alpabat[(int)c-97]='-';//맞춘 알파벳을 알파벳 배열에서 가리기
                     success=true;//단어를 맞췄으므로 true리턴
                  }
               }
              
                      
           if((int)f_input>=97&&f_input<=122) {//알파벳 소문자 입력시
               if(check[(int)f_input-97]==true) {//이미 입력되어 check배열의 값이 true임
                  System.out.println("중복된 character를 입력하였습니다.");
                   fail++;//실패 횟수 증가
              }
               else {
                  if(success==true) {//사용자가 알파벳을 맞췄을때
                          System.out.println(f_input+"가 존재합니다!");
                          check[(int)f_input-97]=true;}//입력한 알파벳을 check배열에 true로 입력했다고 표시
                       else {//사용자가 알파벳을 맞추지 못했을때 
                          System.out.println(f_input+"가 없습니다!");
                          check[(int)f_input-97]=true;//입력한 알파벳을 check배열에 true로 입력했다고 표시
                          alpabat[(int)f_input-97]='-';//입력한 알파벳을 알파벳 배열에서 가리기
                             fail++;}//실패 횟수 증가

               }
              }
           else if (f_input<97||f_input>122) {//알파벳 소문자 외에 다른거 입력했을때
               System.out.println("잘못입력하셨습니다.");
            }
               for(int i=0;i<newRandomWord.length();i++) {
                  if(hiddenWord.charAt(i)=='-')//가려진 단어를  아직 못맞춰 '-'가 존재할때
                        return false;//게임 실패 리턴
               }
            
               return true;//가려진 단어를 모두 맞춰 단어에 '-'가 없을때 성공 리턴
            }
               
         
       
      public static void main(String[] args) {
         Project_김지원_1711412 game = new Project_김지원_1711412();
         game.gameStart();
        
      }

   }