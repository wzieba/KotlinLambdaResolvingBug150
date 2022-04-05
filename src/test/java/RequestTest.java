import org.junit.Test;

import static org.junit.Assert.*;

public class RequestTest {
    @Test
    public void isObjectSuperToObjectArray() {
        Object[] objectArray = new Object[5];

        assertTrue(objectArray instanceof Object);
    }
}