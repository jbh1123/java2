public class Rectangle extends Shape
{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String draw() {
        StringBuilder output = new StringBuilder();
        output.append("*".repeat(length)).append("\n");
        for (int i = 0; i < width - 2; i++) {
            output.append("*").append(" ".repeat(length - 2)).append("*\n");
        }
        output.append("*".repeat(length)).append("\n");
        return output.toString();
    }
}
