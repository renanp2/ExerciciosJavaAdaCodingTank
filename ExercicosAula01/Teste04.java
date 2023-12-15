package ExercicosAula01;

public class Teste04 {
    public static double[] custosCarro( double[] input) {

                double percentualCustoDistribuidor = (input[1] / input[0]) * 100;
                double percentualCustoImpostos = (input[2] / input[0]) * 100;

                percentualCustoDistribuidor = (Math.round(percentualCustoDistribuidor * 100)/100.0);
                percentualCustoImpostos = (Math.round(percentualCustoImpostos * 100)/100.0);

                return new double[]{percentualCustoDistribuidor,percentualCustoImpostos};
    }
}
