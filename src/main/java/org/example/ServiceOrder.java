package org.example;

import java.util.Observable;

public class ServiceOrder extends Observable {
    private ServiceOrderState state;

    public ServiceOrder() {
        this.state = ServiceOrderStateCreated.getInstance();
    }

    public void setState(ServiceOrderState state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }

    public String toString() {
        return "Ticket{" + "Estado=" + state + '}';
    }

    public boolean create() {
        return state.create(this);
    }

    public boolean open() {
        return state.open(this);
    }

    public boolean init() {
        return state.init(this);
    }

    public boolean pause() {
        return state.pause(this);
    }

    public boolean finish() {
        return state.finish(this);
    }

    public String getNameState() {
        return state.getState();
    }

    public ServiceOrderState getState() {
        return state;
    }
}
