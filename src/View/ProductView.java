package View;

import java.util.Scanner;

public class ProductView {

    private Scanner input;

    public ProductView() {
        this.input = new Scanner(System.in);
    }

    public void printMenu() {

    }

    public int getInteger() {
        return this.input.nextInt();
    }

    public String getString() {
        return this.input.nextLine();
    }

    public double getDouble() {
        return this.input.nextDouble();
    }

    public void showText(String text) {
        System.out.println();
    }

}
