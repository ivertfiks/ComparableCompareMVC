package Model;

public class ProductModel implements Comparable<ProductModel>{

    private int productId;
    private String productName;
    private double price;

    public ProductModel(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public ProductModel() {
        this.productId = 0;
        this.productName = "default";
        this.price = 0;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price;
    }

    @Override
    public int compareTo(ProductModel product) {
        return productId - product.getProductId();
    }
}
