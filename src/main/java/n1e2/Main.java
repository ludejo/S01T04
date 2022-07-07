package n1e2;

public class Main {
    public static void main(String[] args) {
        CalculadoraLletraDNI calc = new CalculadoraLletraDNI();
        try {
            System.out.println(calc.calcularLletra(47235315));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
