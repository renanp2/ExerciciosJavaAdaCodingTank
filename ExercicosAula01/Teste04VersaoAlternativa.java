package ExercicosAula01;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Esse modelo funciona mas necessita de classes externas e não é o que a plataforma pede

public class Teste04VersaoAlternativa {
    public static void main(String[] args) {

        double[] resultado = custosCarro(new double[]{115500.00,25000.00,32500.00});
        for (int i = 0; i < resultado.length; i++){
            System.out.println(resultado[i]);
        }
    }
    public static double[] custosCarro( double[] input) {

        double percentualCustoDistribuidor = (input[1] / input[0]) * 100;
        double percentualCustoImpostos = (input[2] / input[0]) * 100;

        BigDecimal percentualArredondadoDistribuidor = BigDecimal.valueOf(percentualCustoDistribuidor).setScale(2, RoundingMode.CEILING);
        BigDecimal percentualArredondadoImpostos = BigDecimal.valueOf(percentualCustoImpostos).setScale(2, RoundingMode.CEILING);

        return new double[]{percentualArredondadoDistribuidor.doubleValue(),percentualArredondadoImpostos.doubleValue()};
    }
}
