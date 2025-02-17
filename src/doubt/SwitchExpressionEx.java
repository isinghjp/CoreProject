package doubt;

public class SwitchExpressionEx {
    public static String getSeason(int month) {
        return switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month";
        };
    }

    public static void main(String[] args) {
        System.out.println(getSeason(6)); // Output: Summer
        System.out.println(getSeason(11)); // Output: Autumn
        System.out.println(getSeason(13)); // Output: Invalid month
    }
}
