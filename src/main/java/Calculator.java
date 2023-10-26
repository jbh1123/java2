import java.util.ArrayList;

public class Calculator implements Calculatable {
    private StringBuilder history;

    public Calculator() {
        history = new StringBuilder("[");
    }

    public String getHistory() {
        history.replace(history.length() - 2, history.length(), "]");
        return history.toString();
    }

    public Integer add(Integer n1, Integer n2) {
        Integer result = n1 + n2;
        history.append(n1 + " + " + n2 + " = " + result + ", ");
        return result;
    }

    public Integer subtract(Integer n1, Integer n2) {
        Integer result = n1 - n2;
        history.append(n1 + " - " + n2 + " = " + result + ", ");
        return result;
    }

    public Integer divide(Integer n1, Integer n2) {
        Integer result = n1 / n2;
        history.append(n1 + " / " + n2 + " = " + result + ", ");
        return result;
    }

    public Integer multiply(Integer n1, Integer n2) {
        Integer result = n1 * n2;
        history.append(n1 + " * " + n2 + " = " + result + ", ");
        return result;
    }
}