import java.util.Scanner; // Importing scanner class to create user input

public class SquareCalculatorExtension {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the Width");
        double width = reader.nextDouble();
        System.out.println("Enter the Height");
        double height = reader.nextDouble();
        double perimeter = 2*(width+height);
        double area = (width*height);
        System.out.println("The height is " + height + " and the width is " + width);
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
}