public class AwesomeNumber
{
    private int num;

    public AwesomeNumber(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static AwesomeNumber add(AwesomeNumber n1, AwesomeNumber n2) {
        return new AwesomeNumber(n1.getNum() + n2.getNum());
    }

    public static AwesomeNumber subtract(AwesomeNumber n1, AwesomeNumber n2) {
        return new AwesomeNumber(n1.getNum() - n2.getNum());
    }

    @Override
    public String toString() {
        return Integer.toString(num);
    }
}
