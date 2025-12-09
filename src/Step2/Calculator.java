package Step2;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Double> Realresult = new ArrayList<>();
    double result;

    public void calculate(int num1, int num2, char symbol) {

        if (symbol == '+') {
            result = num1 + num2;
            Realresult.add(result);
        }
        else if (symbol == '-') {
            result = num1 - num2;
            Realresult.add(result);
        }
        else if (symbol == '*') {
            result = num1 * num2;
            Realresult.add(result);
        }
        else if (symbol == '/') {
            result = (double) num1 / num2;
            Realresult.add(result);
        }
        else {
            System.out.println("올바르지 않은 계산 기호입니다.");
        }
    }

    public double getResult() {
        return result;
    }

    public ArrayList<Double> getRealresult() {
        return Realresult;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void removeResult() {
        Realresult.removeFirst();
    }

}
