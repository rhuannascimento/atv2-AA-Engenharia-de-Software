package org.example;

public abstract class ServiceOrderState {
    public abstract String getState();

    public boolean create(ServiceOrder serviceOrder) {
        return false;
    }

    public boolean open(ServiceOrder serviceOrder) {
        return false;
    }

    public boolean init(ServiceOrder serviceOrder) {
        return false;
    }

    public boolean pause(ServiceOrder serviceOrder) {
        return false;
    }

    public boolean finish(ServiceOrder serviceOrder) {
        return false;
    }
}
