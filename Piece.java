
public class Piece {

    private int x = -1;
    private int y = -1;

    private String Color;

    public Piece(String color) {
        this.Color = color;
    }

    public String displayPosition() {
        if (x != -1 && y != -1) {

            return "(x:" + x + ",y:" + y + ")";

        }

        return "(x:none,y:none)";

    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
