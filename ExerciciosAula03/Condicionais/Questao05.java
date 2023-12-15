package ExerciciosAula03.Condicionais;

public class Questao05 {
    public static double custoCompra(double input) {
        if(input > 10) {
            double valorFinal = input * 1.25;
            return Math.round(valorFinal * 100.0) / 100.0;
        }
        double valorFinal = input * 1.45;
        return Math.round(valorFinal * 100.0) / 100.0;
    }
}
