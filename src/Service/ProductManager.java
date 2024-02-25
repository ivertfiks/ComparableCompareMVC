package Service;

import Model.ProductModel;
import View.ProductView;
import View.UserInterfaceCommands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    private List<ProductModel> productList = new ArrayList<>();
    private ProductView view;
    public void add(ProductModel product){
        productList.add(product);
    }

    public void showProducts(){
        for(ProductModel product : productList){
            System.out.println(product.toString());
        }
    }

    public void addProducts() {
        int id;
        double price;
        String productName;
        System.out.println(UserInterfaceCommands.INPUT_ID);
        id = view.getInteger();
        System.out.println(UserInterfaceCommands.INPUT_NAME);
        productName = view.getString();
        System.out.println(UserInterfaceCommands.INPUT_PRICE);
        price = view.getDouble();
        productList.add(new ProductModel(id, productName, price));
    }

    public void sortProducts(){
        Collections.sort(productList);
    }

    public void sortByName(){
        Collections.sort(productList, new ProductNameComparator());
    }

    public void sortByPrice(){
        Collections.sort(productList, new ProductPriceComparator());
    }
}