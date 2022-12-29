public class ElseIfStatement {
    public static void main(String[] args) {
        String TrafficLight = "Red";
        if (TrafficLight == "Green"){
            System.out.println("You can go");
        }
        else if (TrafficLight == "Amber"){
            System.out.println("Get ready to go");
        }
        else System.out.println("Stop");
    }
}
