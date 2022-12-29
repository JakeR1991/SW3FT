import static java.awt.SystemColor.text;

public class LogicalNot {
    public static void main(String[] args) {
        System.out.println("Is the shoe colour 'Black'?");
        String Colour = "Blue";
        if (!(text.equals("Black"))) {
            System.out.println("No!");
        } else {
            System.out.println("Yes");
        }
    }}