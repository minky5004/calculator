package Step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();
        Scanner stdin = new Scanner(System.in);

        while (true) {

            OperatorType op = null;
            System.out.println("첫 번째 숫자를 입력하세요 : ");
            double num1 = stdin.nextDouble();
            System.out.println("두 번째 숫자를 입력하세요 : ");
            double num2 = stdin.nextDouble();

            System.out.println("연산을 원하는 기호를 입력해주세요 : ");
            char symbol = stdin.next().charAt(0);


            if (symbol == '+') {
                op= OperatorType.ADD;
            }else if (symbol == '-') {
                op= OperatorType.SUB;
            }else if (symbol == '*') {
                op= OperatorType.MUL;
            }else if (symbol == '/') {
                op= OperatorType.DIV;
            }

            calculator.calculate(num1, num2, op);

            double result = calculator.getResult();
            ArrayList<Double> resultlist = calculator.getRealresult();

            System.out.println("계산 결과 : " + result);
            System.out.println("더 계산하시겠습니까?");
            System.out.println("1. 공백 입력시 계산기 다시 실행");
            System.out.println("2. exit 입력시 계산기 종료");
            System.out.println("3. histroy 입력시 계산 기록 출력");
            System.out.println("4. remove 입력시 가장 먼저 입력된 계산 기록 삭제");
            System.out.println("5. serch 입력시 입력 값보다 큰 기록 조회");

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

            }else if (userResult.equals("search")) {
                System.out.println("기준값을 입력하세요");
                double key = stdin.nextDouble();
                List<Double> searchResult = calculator.searchResult(key);
                System.out.println("searchResult = " + searchResult);
            }
        } // 반복문 끝
    }
}
