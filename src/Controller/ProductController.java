package Controller;

import Model.ProductModel;
import Service.ProductManager;
import Service.ProductService;
import View.ProductView;
import View.UserInterfaceCommands;

public class ProductController {

    private ProductModel model;
    private ProductView view;
    private ProductService service;
    private ProductManager productManager;

    public ProductController() {
        this.model = new ProductModel();
        this.view = new ProductView();
        this.service = new ProductService();
    }

    public void run() {
        boolean isRunable = true;
        view.printMenu();
        int number;
        while (isRunable) {
            number = view.getInteger();
            switch (number) {
                case 1:
                    productManager.addProducts();
                    break;
                case 2:
                    productManager.sortProducts();
                    break;
                case 3:
                    productManager.sortByName();
                    break;
                case 4:
                    productManager.sortByPrice();
                    break;
                case 5:
                    productManager.showProducts();
                    break;
                case 0:
                    isRunable = false;
                    break;
                default:
                    System.out.println(UserInterfaceCommands.ERROR_INPUT);
                    break;
            }
        }
    }
}