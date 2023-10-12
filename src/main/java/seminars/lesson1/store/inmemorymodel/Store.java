package seminars.lesson1.store.inmemorymodel;

import seminars.lesson1.store.modelelements.Order;

import java.util.Collection;
import java.util.HashSet;

public class Store {

    private Collection<Order> orders = new HashSet<Order>();

    public boolean addOrder(Order order){
        orders.add(order);
        return true;
    }

    public boolean cancelOrder(int id){
        //TODO: Отмена заказа
        for (Order order : orders)
        {
            if (order.getId() == id) {
                orders.remove(order);
                return true;
            }
        }
        return false;
    }

    public boolean paymentOrder(int id)
    {
        //TODO: Оплата заказа
        for (Order order : orders)
        {
            if (order.getId() == id) {

            }
        }
        return true;
    }

}
