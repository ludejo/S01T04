package n2;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LlocTest {

    Lloc mordor = new Lloc("Mordor");

    @Test
    void llarg8Test() {
        assertThat(mordor.getNom(), llargada(is(not(8))));
    }

    @Test
    void llarg6Test() {
        assertThat(mordor.getNom(), llargada(is(6)));
    }

    public static Matcher<String> llargada(Matcher<Integer> matcher) {
        return new MatcherPersonalitzat(matcher, "la llargada esperada de la cadena de text", "llargada");
    }

}