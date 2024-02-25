package Service;

import Model.ProductModel;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<ProductModel> {

    @Override
    public int compare(ProductModel productOne, ProductModel productTwo) {
        return productOne.getProductName().compareTo(productTwo.getProductName());
    }
}
