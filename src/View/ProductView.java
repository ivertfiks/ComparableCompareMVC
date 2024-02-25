package View;

import java.io.IOException;
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

    public int getInteger() throws IOException {
        return input.nextInt();
    }

    public String getString() throws IOException {
        return input.nextLine();
    }

    public double getDouble() throws IOException {
        return input.nextDouble();
    }

    public void showText(String text) {
        System.out.println();
    }

}
