// Kylie Tate
// 9-8-25

import java.util.Scanner;

public class CrossProduct {
    public double[] vecA = new double[3];
    public double[] vecB = new double[3];
    public double [] products = new double[3];
    public boolean mayRun = true;

    public void askForVector() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vector A in this format: x,y,z");

        String vecAStr = scanner.nextLine();
        String[] vecAElStr = vecAStr.split(",");
        for (int i = 0; i < vecAElStr.length; i++) {
            vecA[i] = Double.parseDouble(vecAElStr[i]);
        }
        System.out.println("Enter vector B in this format: x,y,z");

        String vecBStr = scanner.nextLine();
        String[] vecBElStr = vecBStr.split(",");
        for (int i = 0; i < vecBElStr.length; i++) {
            vecB[i] = Double.parseDouble(vecBElStr[i]);
        }
    }
    public void calculate() {
        products[0] = vecA[1]*vecB[2] - vecA[2]*vecB[1];
        products[1] = vecA[2]*vecB[0] - vecA[0]*vecB[2];
        products[2] = vecA[0]*vecB[1] - vecA[1]*vecB[0];
    }
    public void running() {
        System.out.println("Another? (type n or y)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.charAt(0) == 'n') {
            mayRun = false;
        }
    }
}
