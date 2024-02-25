package View;

public enum MenuOperations {

    ADD("Press 1 to add a product."),
    SORTID("Press 2 to sort by product ID."),
    SORTNAME("Press 3 to sort by product name."),
    SORTPRICE("Press 4 to sort by product price."),
    DISPLAYALL("Press 5 to display all products."),
    EXIT("Press 0 to exit");

    private String operaion;

    public String getOperaion() {
        return this.operaion;
    }

    private MenuOperations(String operation) {
        this.operaion = operation;
    }

}
