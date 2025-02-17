package doubt;

public class DiscountCalculator {
    public static double getDiscount(String userType) {
        switch (userType.toLowerCase()) {
            case "student":
                return 10.0;
            case "senior":
                return 15.0;
            case "regular":
                return 5.0;
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Student Discount: " + getDiscount("student") + "%"); // Output: 10.0%
        System.out.println("Senior Discount: " + getDiscount("senior") + "%"); // Output: 15.0%
        System.out.println("Guest Discount: " + getDiscount("guest") + "%"); // Output: 0.0%
    }
}
