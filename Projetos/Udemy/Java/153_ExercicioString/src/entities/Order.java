package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.Status;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
    private Date moment;
    private Status orderStatus;
    private List<orderItem> list = new ArrayList();
    private Client client;

    public Order() {
    }

    public Order(Date moment, Status orderStatus, Client client) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public void addItem(orderItem item) {
        list.add(item);

    }

    public void removeItem(orderItem item) {
        list.remove(item);
    }

    public Double total(List<orderItem> list) {
        Double total = 0.0;
        
        return total;

    }

}
