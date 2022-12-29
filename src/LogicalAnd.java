public class LogicalAnd {
    public static void main(String[] args) {
        int number = 1000000;
        if (number > 0 && number <85000){
            System.out.println("Your protected by the Financial Services Compensation Scheme");
        }
        else {
            System.out.println("You're not protected for £" + (number-85000));
    }
}
}
