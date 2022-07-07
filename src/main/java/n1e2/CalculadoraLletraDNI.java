package n1e2;

public class CalculadoraLletraDNI {
    private static final String[] lletres = {
            "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
            "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public CalculadoraLletraDNI() {
    }

    public String calcularLletra(int id) throws Exception {
        int idLen = String.valueOf(id).length();
        if (idLen != 8) {
            if (idLen < 8) {
                throw new Exception("Número no vàlid: curt");
            } else {
                throw new Exception("Número no vàlid: llarg");
            }
        } else {
            if (id < 0) {
                throw new Exception("Número no vàlid: negatiu");
            }
        }
        return lletres[id % 23];
    }
}
