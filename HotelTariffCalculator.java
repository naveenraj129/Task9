import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();
        System.out.print("Enter the number of days stayed: ");
        int daysStayed = scanner.nextInt();

        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                roomRent *= 1.2;
                break;
            default:
                break;
        }

        double hotelTariff = roomRent * daysStayed;
        System.out.printf("Hotel tariff to be paid: %.2f%n", hotelTariff);
    }
}
