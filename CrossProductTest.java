import java.util.Scanner;

class DecimalTest {
    public static void main(String[] args) {

        boolean mayRun = true;

        while (mayRun) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            double num = scanner.nextDouble();

            System.out.println("Enter the base");
            int base = scanner.nextInt();

            Decimal conversion = new Decimal(num, base);

            conversion.conIntBack();
            for(int i = 0; i < conversion.conInt().size(); i++) {
                System.out.print(conversion.conInt().get(i));
            }
            System.out.print(".");

            for (int i = 0; i < conversion.conDec().size(); i++) {
                System.out.print(conversion.conDec().get(i));
            }

            if (conversion.conDec().size() > 10) {
                System.out.println("...");
            }
            System.out.println("Another? (type n or y)");
            Scanner scannerAns = new Scanner(System.in);
            String answer = scannerAns.nextLine();
            if (answer.charAt(0) == 'n') {
                mayRun = false;
            }
        }
    }
}
