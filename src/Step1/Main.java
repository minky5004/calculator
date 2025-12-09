package Step1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       while (true) {

           double result = 0;
           Scanner stdin = new Scanner(System.in);

           System.out.println("첫 번째 숫자를 입력하세요 : ");
           int num1 = stdin.nextInt();
           System.out.println("두 번째 숫자를 입력하세요 : ");
           int num2 = stdin.nextInt();

           System.out.println("연산을 원하는 기호를 입력해주세요 : ");
           char symbol = stdin.next().charAt(0);

           if (symbol == '+') {
               result = num1 + num2;
           }
           else if (symbol == '-') {
               result = num1 - num2;
           }
           else if (symbol == '*') {
               result = num1 * num2;
           }
           else if (symbol == '/') {
               result = (double) num1 / num2;
           }
           else {
               System.out.println("올바르지 않은 계산 기호입니다.");
           }

           System.out.println("계산 결과 : " + result);
           System.out.println("더 계산하시겠습니까? (no 입력 시 종료)");
           System.out.println("공백 입력시 계산기 다시 실행");

           stdin.nextLine(); // 개행문자 버퍼가 남아있는것 같음
           String userResult = stdin.nextLine();

           if (userResult.equals("no")) {
               break;
           }
           else {
               continue;
           }

       } // 반복문 끝

        System.out.println("Log");

    }
}
