package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    //REFERENCIANDO UM OBJETO PRODUCT
    private Product product;

    //MÉTODO CONSTRUTOR SEM ARGUMENTOS
    public OrderItem(){
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTOS
    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    //MÉTODOS GETTERS AND SETTERS
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    //MÉTODO FUNÇÃO
    public double subTotal() {
        return price * quantity;
    }

    //MÉTODO TOSTRING DENTRO DA CLASSE OVERRIDE
    @Override
    public String toString() {
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
