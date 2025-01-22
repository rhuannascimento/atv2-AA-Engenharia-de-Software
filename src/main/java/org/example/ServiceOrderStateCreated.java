package org.example;

public class ServiceOrderStateCreated extends ServiceOrderState{
    private ServiceOrderStateCreated() {};
    private static ServiceOrderStateCreated instance = new ServiceOrderStateCreated();
    public static ServiceOrderStateCreated getInstance() {
        return instance;
    }

    public String getState() {
        return "Criado";
    }

    public boolean open(ServiceOrder serviceOrder) {
        serviceOrder.setState(ServiceOrderStateOpened.getInstance());
        return true;
    }

    public boolean init(ServiceOrder serviceOrder) {
        serviceOrder.setState(ServiceOrderStateInProgress.getInstance());
        return true;
    }
}
