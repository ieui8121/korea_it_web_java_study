package _35_Lambda;

import java.util.Scanner;

//Main 에서 정적 메소드로 execute 만들고 매개변수로 String input,
//언터페이스 StringProcessor processor 두가지 받음
//return 으로 processor.process(input);
//스캐너 객체 하나 만들기
//람다식으로 구현 => 모두 대문자로, 모두 소문자로, 접두사로 >> 붙이기. 문자열 거꾸로
//접두사, 문자열 거꾸로 >> 검색
//스캐너로 영문 하나 입력받고 4가지 실행 결과물 출력
public class StringProcessorMain {
    public static  String execute(String input, StringProcessor processor) {
        return processor.process(input);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

}
