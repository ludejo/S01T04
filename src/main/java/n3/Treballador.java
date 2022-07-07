package n3;

public class Treballador {
    private String nom;
    private String cognom;
    private String DoB;

    private final int[] habitacions = {101, 102, 201, 202, 303};

    public Treballador(String nom, String cognom, String doB) {
        this.nom = nom;
        this.cognom = cognom;
        this.DoB = doB;
    }

    public int[] getHabitacions() {
        return habitacions;
    }
}
