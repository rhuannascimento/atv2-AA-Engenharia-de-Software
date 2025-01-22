package org.example;

public class ServiceOrderStateInProgress extends ServiceOrderState{
    private ServiceOrderStateInProgress() {};
    private static ServiceOrderStateInProgress instance = new ServiceOrderStateInProgress();
    public static ServiceOrderStateInProgress getInstance() {
        return instance;
    }

    public String getState() {
        return "Em Progresso";
    }

    public boolean finish(ServiceOrder serviceOrder) {
        serviceOrder.setState(ServiceOrderStateFinished.getInstance());
        return true;
    }

    public boolean pause(ServiceOrder serviceOrder) {
        serviceOrder.setState(ServiceOrderStatePaused.getInstance());
        return true;
    }
}
