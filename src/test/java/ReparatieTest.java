import static org.junit.Assert.*;

public class ReparatieTest {

    @org.junit.Test
    public double getStringStatus(int i) {
        Reparatie r = new Reparatie();
        r.getStringStatus(2);
        assertEquals("BB", getStringStatus(2));
        return 0;
    }

    @org.junit.Test
    public void getStringPriority() {
    }
}