public class WeekOne {
    public static void main(String[] args) {
        int dzielnik;
        for (int i = 4; i <= 100; i++) {
            System.out.println("\nDzielnikiem liczby: " + i + " są liczby: ");
            for (dzielnik = 1; dzielnik <= i; dzielnik++) {
                if (i % dzielnik == 0) {
                    System.out.print(dzielnik + ",");
                }
            }
        }
    }
}
