import java.lang.Math;

public class CircleCalculator {
    public static void main(String[] args) {
        double circleRadius = 12.0;
        double circleDiameter = circleRadius*2;
        double circleCircumference = circleDiameter*Math.PI;
        double circleArea = Math.PI*circleRadius*circleRadius;

        System.out.println("The circle's Radius is " + circleRadius);
        System.out.println("The circle's Diameter is " + circleDiameter);
        System.out.println("The circle's circumference is " + circleCircumference);
        System.out.println("The circle's area is " + circleArea);
    }
}
