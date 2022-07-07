package n1e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendariTest {

    Calendari calendari = new Calendari();

    @Test
    void mesosLength12() {
        assertEquals(12, calendari.getMesos().size());
    }

    @Test
    void mesosNotNull() {
        assertNotNull(calendari.getMesos());
    }

    @Test
    void mesosAgost8() {
        assertEquals("Agost", calendari.getMesos().get(7));
    }
}