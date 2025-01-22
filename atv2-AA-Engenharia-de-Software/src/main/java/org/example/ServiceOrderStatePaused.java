package org.example;

public class ServiceOrderStatePaused extends ServiceOrderState{
    private ServiceOrderStatePaused() {};
    private static ServiceOrderStatePaused instance = new ServiceOrderStatePaused();
    public static ServiceOrderStatePaused getInstance() {
        return instance;
    }

    public String getState() {
        return "Pausado";
    }

    public boolean init(ServiceOrder serviceOrder) {
        serviceOrder.setState(ServiceOrderStateInProgress.getInstance());
        return true;
    }

    public boolean finish(ServiceOrder serviceOrder) {
        serviceOrder.setState(ServiceOrderStateFinished.getInstance());
        return true;
    }
}
