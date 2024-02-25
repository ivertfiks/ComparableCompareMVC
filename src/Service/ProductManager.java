package Service;

import Model.ProductModel;
import View.ProductView;
import View.UserInterfaceCommands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    private List<ProductModel> productList = new ArrayList<>();
    private ProductView view = new ProductView();
    private int idCounter = 1;
    public void showProducts(){
        for(ProductModel product : productList){
            System.out.println(product.toString());
        }
    }

    public void addProduct() throws IOException {
        double price;
        String productName;
        try {
            System.out.println(UserInterfaceCommands.INPUT_NAME.getCommandName());
            if(idCounter != 1) { // bug fix
                view.getString();
            }
            productName = view.getString();
            System.out.println(UserInterfaceCommands.INPUT_PRICE.getCommandName());
            price = view.getDouble();
            productList.add(new ProductModel(idCounter, productName, price));
            idCounter++;
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sortProducts(){
        Collections.sort(productList);
    }

    public void sortByName(){
        productList.sort(new ProductNameComparator());
    }

    public void sortByPrice(){
        productList.sort(new ProductPriceComparator());
    }
}
