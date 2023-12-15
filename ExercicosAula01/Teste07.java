package ExercicosAula01;

public class Teste07 {
    public static double salarioComComissao( double[] input) {
        double numeroDeCarrosVendidos = (int) input[0];
        double vendasMes = input[1];
        double salarioFixo = input[2];
        double valorFixoVendasPorCarro = input[3];

        double totalRecebidoNoMes = salarioFixo + (vendasMes * 0.05) + (numeroDeCarrosVendidos * valorFixoVendasPorCarro);
        totalRecebidoNoMes = Math.round(totalRecebidoNoMes* 100.0) / 100.0;
        return totalRecebidoNoMes;
    }
}
