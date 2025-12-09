package Step3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T> {

    ArrayList<Double> Realresult = new ArrayList<>();
    double result;

    public void calculate(T num1, T num2, OperatorType op) {

        double Realnum1 = (Double) num1;
        double Realnum2 = (Double) num2;

        if (op == OperatorType.ADD) {
            result = Realnum1 + Realnum2;
            Realresult.add(result);
        } else if (op == OperatorType.SUB) {
            result = Realnum1 - Realnum2;
            Realresult.add(result);
        } else if (op == OperatorType.MUL) {
            result = Realnum1 * Realnum2;
            Realresult.add(result);
        } else if (op == OperatorType.DIV) {
            result = Realnum1 / Realnum2;
            Realresult.add(result);
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

    public List<Double> searchResult(double key) {
        return Realresult.stream()
                        .filter(resultValue -> resultValue > key)
                        .collect(Collectors.toList());
    }
    }
