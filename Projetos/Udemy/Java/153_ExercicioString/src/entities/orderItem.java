package entities;

public class orderItem {

    private int quantity;
    private Double price;
    private Product product;

    public orderItem() {

    }

    public orderItem(int quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {

        return price * quantity;

    }

    @Override
    public String toString() {
        
        return getProduct().getName() 
        + ", $"
        + String.format("%.2f", price, null)
        +"; Quantity: "
        + quantity
        + ", Subtotal: $"
        + String.format("%.2f", subTotal(), null);
    }


}
