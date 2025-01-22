package org.example;

public class ServiceOrderStateFinished extends ServiceOrderState{
    private ServiceOrderStateFinished() {};
    private static ServiceOrderStateFinished instance = new ServiceOrderStateFinished();
    public static ServiceOrderStateFinished getInstance() {
        return instance;
    }

    public String getState() {
        return "Finalizado";
    }
}
