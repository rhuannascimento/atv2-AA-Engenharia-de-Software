import org.junit.jupiter.api.Test;
import org.example.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {
    @Test
    void notifyOneUser() {
        User user = new User();
        ServiceOrder serviceOrder = new ServiceOrder();
        user.linkToServiceOrder(serviceOrder);
        serviceOrder.setState(ServiceOrderStateOpened.getInstance());
        assertEquals("Ticket{Estado=Aberto}", user.getLastNotification());
    }

    @Test
    void notifyTwoUser() {
        User user1 = new User();
        User user2 = new User();
        ServiceOrder serviceOrder = new ServiceOrder();
        user1.linkToServiceOrder(serviceOrder);
        user2.linkToServiceOrder(serviceOrder);
        serviceOrder.setState(ServiceOrderStateOpened.getInstance());
        assertEquals("Ticket{Estado=Aberto}", user1.getLastNotification());
        assertEquals("Ticket{Estado=Aberto}", user2.getLastNotification());
    }

}
