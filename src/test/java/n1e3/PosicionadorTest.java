package n1e3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PosicionadorTest {

    Posicionador p = new Posicionador();
    ArrayList<String> mesos = new ArrayList<>(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Decembre"));

    @Test
    void locOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> {
                    p.loc(mesos, 20);
                });
    }
}