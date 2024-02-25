package View;

import java.util.Scanner;

public class ProductView {

    private Scanner input;

    public ProductView() {
        this.input = new Scanner(System.in);
    }

    public void printMenu() {
        for(MenuOperations operations : MenuOperations.values()){
            System.out.println(operations.getOperaion());
        }
    }

    public int getInteger() {
        return input.nextInt();
    }

    public String getString() {
        return input.nextLine();
    }

    public double getDouble() {
        return input.nextDouble();
    }

    public void showText(String text) {
        System.out.println();
    }

}
