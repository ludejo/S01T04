package n1e3;

import java.util.List;

public class Posicionador {

    public Posicionador() {
    }

    public <T> T loc(List<T> list, int idx) throws ArrayIndexOutOfBoundsException {
        if (idx > list.size()) {
            throw new ArrayIndexOutOfBoundsException("Index superior al número d'elements");
        }
        return list.get(idx);
    }
}
