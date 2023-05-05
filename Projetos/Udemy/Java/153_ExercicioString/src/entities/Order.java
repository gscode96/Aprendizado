package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.Status;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
    private Date moment;
    private Status orderStatus;
    private List<orderItem> items = new ArrayList<orderItem>();
    private Client client;

    public Order() {
    }

    public Order(Date moment, Status orderStatus, Client client) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Status getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(Status orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(orderItem item) {
        items.add(item);

    }

    public void removeItem(orderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double sum = 0.0;
        for (orderItem it : items) {
            sum = sum += it.subTotal();
        }

        return sum;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order Status: ");
        sb.append(orderStatus + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (orderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }

}
