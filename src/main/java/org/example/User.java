package org.example;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {

    private String lastNotification;

    public void linkToServiceOrder(ServiceOrder serviceOrder) {
        serviceOrder.addObserver(this);
    }

    @Override
    public void update(Observable serviceOrder, Object arg) {
        this.lastNotification = serviceOrder.toString();
    }

    public String getLastNotification() {
        return this.lastNotification;
    }
}
