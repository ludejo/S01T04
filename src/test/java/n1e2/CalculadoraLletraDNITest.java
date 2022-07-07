package n1e2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraLletraDNITest {

    CalculadoraLletraDNI calc = new CalculadoraLletraDNI();

    @ParameterizedTest
    @CsvSource({"47235316,D", "47235315,P", "34738743,A", "27561854,B", "54489731,V"})
    void calcularLletraParamCorrecte(int num, String esperat) throws Exception {
        assertEquals(esperat, calc.calcularLletra(num));
    }

    @ParameterizedTest
    @CsvSource({"38522684,T", "65421626,M", "12458923,T", "23232323,F", "20589312,Z"})
    void calcularLletraParamIncorrecte(int num, String esperat) throws Exception {
        assertNotEquals(esperat, calc.calcularLletra(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {111, 123456789, -1, -3657841, -85264738, 7654321, 0})
    void calcularLletraParamError(int num) {
        try {
            calc.calcularLletra(num);
            fail("Exception expected");
        } catch (Exception e) {
            assertTrue(true);
            System.out.println(e.getMessage());
        }
    }
}