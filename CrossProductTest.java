class CrossProductTest {
    public static void main(String[] args) {
        CrossProduct crpr = new CrossProduct();
        while (crpr.mayRun) {

            crpr.askForVector();
            crpr.calculate();

            System.out.printf("<%f, %f, %f>%n", crpr.products[0], crpr.products[1], crpr.products[2]);

            crpr.running();
        }
    }
}
