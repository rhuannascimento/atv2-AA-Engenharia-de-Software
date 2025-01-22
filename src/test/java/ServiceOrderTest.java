import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceOrderTest {

    ServiceOrder serviceOrder;

    @BeforeEach
    public void setUp() {
        serviceOrder = new ServiceOrder();
    }

    //Created

    @Test
    public void notCreateServiceOrderCreated() {
        serviceOrder.setState(ServiceOrderStateCreated.getInstance());
        assertFalse(serviceOrder.create());
    }

    @Test
    public void notPauseServiceOrderCreated() {
        serviceOrder.setState(ServiceOrderStateCreated.getInstance());
        assertFalse(serviceOrder.pause());
    }

    @Test
    public void notFinishServiceOrderCreated() {
        serviceOrder.setState(ServiceOrderStateCreated.getInstance());
        assertFalse(serviceOrder.finish());
    }

    @Test
    public void openServiceOrderCreated() {
        serviceOrder.setState(ServiceOrderStateCreated.getInstance());
        assertTrue(serviceOrder.open());
    }

    @Test
    public void initServiceOrderCreated() {
        serviceOrder.setState(ServiceOrderStateCreated.getInstance());
        assertTrue(serviceOrder.init());
    }

    //Opened

    @Test
    public void notCreateServiceOrderOpened() {
        serviceOrder.setState(ServiceOrderStateOpened.getInstance());
        assertFalse(serviceOrder.create());
    }

    @Test
    public void notPauseServiceOrderOpened() {
        serviceOrder.setState(ServiceOrderStateOpened.getInstance());
        assertFalse(serviceOrder.pause());
    }

    @Test
    public void notFinishServiceOrderOpened() {
        serviceOrder.setState(ServiceOrderStateOpened.getInstance());
        assertFalse(serviceOrder.finish());
    }

    @Test
    public void notOpenServiceOrderOpened() {
        serviceOrder.setState(ServiceOrderStateOpened.getInstance());
        assertFalse(serviceOrder.open());
    }

    @Test
    public void initServiceOrderOpened() {
        serviceOrder.setState(ServiceOrderStateOpened.getInstance());
        assertTrue(serviceOrder.init());
    }

    //In Progress

    @Test
    public void notCreateServiceOrderInProgress() {
        serviceOrder.setState(ServiceOrderStateInProgress.getInstance());
        assertFalse(serviceOrder.create());
    }

    @Test
    public void pauseServiceOrderInProgress() {
        serviceOrder.setState(ServiceOrderStateInProgress.getInstance());
        assertTrue(serviceOrder.pause());
    }

    @Test
    public void finishServiceOrderInProgress() {
        serviceOrder.setState(ServiceOrderStateInProgress.getInstance());
        assertTrue(serviceOrder.finish());
    }

    @Test
    public void notOpenServiceOrderInProgress() {
        serviceOrder.setState(ServiceOrderStateInProgress.getInstance());
        assertFalse(serviceOrder.open());
    }

    @Test
    public void notInitServiceOrderInProgress() {
        serviceOrder.setState(ServiceOrderStateInProgress.getInstance());
        assertFalse(serviceOrder.init());
    }

    //Paused

    @Test
    public void notCreateServiceOrderPaused() {
        serviceOrder.setState(ServiceOrderStatePaused.getInstance());
        assertFalse(serviceOrder.create());
    }

    @Test
    public void notPauseServiceOrderPaused() {
        serviceOrder.setState(ServiceOrderStatePaused.getInstance());
        assertFalse(serviceOrder.pause());
    }

    @Test
    public void finishServiceOrderPaused() {
        serviceOrder.setState(ServiceOrderStatePaused.getInstance());
        assertTrue(serviceOrder.finish());
    }

    @Test
    public void notOpenServiceOrderPaused() {
        serviceOrder.setState(ServiceOrderStatePaused.getInstance());
        assertFalse(serviceOrder.open());
    }

    @Test
    public void initServiceOrderPaused() {
        serviceOrder.setState(ServiceOrderStatePaused.getInstance());
        assertTrue(serviceOrder.init());
    }

    //Finished

    @Test
    public void notCreateServiceOrderFinished() {
        serviceOrder.setState(ServiceOrderStateFinished.getInstance());
        assertFalse(serviceOrder.create());
    }

    @Test
    public void notPauseServiceOrderFinished() {
        serviceOrder.setState(ServiceOrderStateFinished.getInstance());
        assertFalse(serviceOrder.pause());
    }

    @Test
    public void notFinishServiceOrderFinished() {
        serviceOrder.setState(ServiceOrderStateFinished.getInstance());
        assertFalse(serviceOrder.finish());
    }

    @Test
    public void notOpenServiceOrderFinished() {
        serviceOrder.setState(ServiceOrderStateFinished.getInstance());
        assertFalse(serviceOrder.open());
    }

    @Test
    public void notInitServiceOrderFinished() {
        serviceOrder.setState(ServiceOrderStateFinished.getInstance());
        assertFalse(serviceOrder.init());
    }

}