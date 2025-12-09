package Step2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        while (true) {

            int i = 0;

            Scanner stdin = new Scanner(System.in);

            System.out.println("첫 번째 숫자를 입력하세요 : ");
            int num1 = stdin.nextInt();
            System.out.println("두 번째 숫자를 입력하세요 : ");
            int num2 = stdin.nextInt();

            System.out.println("연산을 원하는 기호를 입력해주세요 : ");

            char symbol = stdin.next().charAt(0);

            calculator.calculate(num1, num2, symbol);

            double result = calculator.getResult();
            ArrayList<Double> resultlist = calculator.getRealresult();

            System.out.println("계산 결과 : " + result);
            System.out.println("더 계산하시겠습니까?");
            System.out.println("1. 공백 입력시 계산기 다시 실행");
            System.out.println("2. exit 입력시 계산기 종료");
            System.out.println("3. histroy 입력시 계산 기록 출력");
            System.out.println("4. remove 입력시 가장 먼저 입력된 계산 기록 삭제");

            stdin.nextLine(); // 개행문자 버퍼가 남아있는것 같음
            String userResult = stdin.nextLine();

            if (userResult.equals("exit")) {
                break;
            }
            else if (userResult.equals("history")) {
                System.out.println("History : " + resultlist);
            }
            else if (userResult.equals("remove")) {
                calculator.removeResult();
            }
        } // 반복문 끝
    }
}
