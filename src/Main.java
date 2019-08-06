import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0]= new Circle(1);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Square(5);
        shapes[3] = new Rectangle(7,8,"Red",true);
        shapes[4] = new Square(10,"Yellow", false);

        for (Shape shape: shapes) {
            if (shape instanceof Square) {
                Square square = (Square)shape;
                System.out.println(square+" ");
                square.howToColor();
            }
        }
    }
}
