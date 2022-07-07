package n3;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

import org.assertj.core.api.OptionalAssert;

import static org.assertj.core.api.Assertions.*;

class TreballadorTest {

    Treballador t1 = new Treballador("Empar", "Empriu", "1985-05-24");
    Treballador c1 = t1;
    Treballador t2 = new Treballador("Empar", "Empriu", "1985-05-24");
    Treballador t3 = new Treballador("Ferran", "Fernàndez", "1990-02-15");
    Treballador t4 = new Treballador("Empar", "Empriu", "1985-05-25");

    // 3.1
    @Test
    public void sameContent() {
        assertThat(t1).usingRecursiveComparison().isEqualTo(t2);
    }

    @Test
    public void differentContent() {
        assertThat(t1).usingRecursiveComparison().isNotEqualTo(t4);
    }

    // 3.2
    @Test
    public void sameReference() {
        assertThat(t1).isEqualTo(c1);
    }

    @Test
    public void differentReferenceTest() {
        assertThat(t1).isNotEqualTo(t2);
    }

    // 3.3
    @Test
    public void arrayContentTest() {
        int[] enters1 = {1, 2, 3, 4, 5};
        int[] enters2 = {1, 2, 3, 4, 5};
        assertThat(enters1).containsExactly(enters2);
    }

    // 3.4
    @Test
    public void arrayListContentTest() {
        ArrayList<Object> potipoti = new ArrayList<>(Arrays.asList("A", 100, 3.14, t1));
        assertThat(potipoti).containsExactly("A", 100, 3.14, t1);
    }

    @Test
    public void arrayListContentAnyTest() {
        ArrayList<Object> potipoti = new ArrayList<>(Arrays.asList("A", 100, 3.14, t1));
        assertThat(potipoti).hasSameElementsAs(Arrays.asList(t1, "A", 3.14, 100));
    }

    @Test
    public void arrayListContentOnceTest() {
        ArrayList<Object> potipoti = new ArrayList<>(Arrays.asList("A", 100, 3.14, t1));
        assertThat(potipoti).containsOnlyOnce(t1);
    }

    @Test
    public void arrayListContentNotTest() {
        ArrayList<Object> potipoti = new ArrayList<>(Arrays.asList("A", 100, 3.14, t1));
        assertThat(potipoti).doesNotContain(t2);
    }

    // 3.5
    @Test
    public void hashmapTest() {
        HashMap<String, Double> hash = new HashMap<>();
        hash.put("euler", 2.718);
        assertThat(hash).containsKey("euler");
    }

    // 3.6a
    @Test
    public void exceptionTestA() {
        assertThatThrownBy(() -> {
            System.out.println(t1.getHabitacions()[9]);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }

    // 3.6b
    @Test
    public void exceptionTestB() {
        Throwable thrown = catchThrowable(() -> {
            System.out.println(t1.getHabitacions()[9]);
        });
        assertThat(thrown).hasMessageContaining("out of bounds");
    }

    // 3.6c
    @Test
    public void exceptionTestC() {
        assertThatIndexOutOfBoundsException().isThrownBy(() -> {
            System.out.println(t1.getHabitacions()[9]);
        });
    }

    // 3.7
    @Test
    public void optionalObjectTest() {
        Optional<String> opt = Optional.empty();
        assertThat(opt).isEmpty();
    }

}