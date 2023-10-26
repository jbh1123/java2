public class Square extends Shape
{
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public String draw() {
        StringBuilder output = new StringBuilder();
        output.append("*".repeat(sideLength)).append("\n");
        for (int i = 0; i < sideLength - 2; i++) {
            output.append("*").append(" ".repeat(sideLength - 2)).append("*\n");
        }
        output.append("*".repeat(sideLength)).append("\n");
        return output.toString();
    }
}