package Service;

import Model.ProductModel;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<ProductModel> {
    @Override
    public int compare(ProductModel productOne, ProductModel productTwo) {
        return (int) ((int) productOne.getPrice() - productTwo.getPrice());
    }
}
