package entities;

public class Product {

    private String name;
    private Double price;

    //MÉTODO CONSTRUTOR SEM ARGUMENTOS
    public Product() {
    }

    //MÉTODO CONSTRUTOR COM ARGUEMENTOS
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //MÉTODOS GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
