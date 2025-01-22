package org.example;

public class ServiceOrderStateOpened extends ServiceOrderState{
    private ServiceOrderStateOpened() {};
    private static ServiceOrderStateOpened instance = new ServiceOrderStateOpened();
    public static ServiceOrderStateOpened getInstance() {
        return instance;
    }

    public String getState() {
        return "Aberto";
    }

    public boolean init(ServiceOrder serviceOrder) {
        serviceOrder.setState(ServiceOrderStateInProgress.getInstance());
        return true;
    }
}
