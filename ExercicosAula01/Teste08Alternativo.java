package ExercicosAula01;

public class Teste08Alternativo {
    public static String geraRecibo(double[] input) {

        double valorTotal = 0.0;
        double menorValor = Double.MAX_VALUE;;

        for (double valor : input) {
            valorTotal += valor;
            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        double desconto = menorValor * 0.5;


        double valorAPagar = valorTotal - desconto;


        String resultado = String.format("Valor total: %.1f | Valor de descontos: %.1f | Valor a pagar: %.1f", valorTotal, desconto, valorAPagar);

        return resultado;
    }

    public static void main(String[] args) {
        // Exemplos de uso
        System.out.println(geraRecibo(new double[]{20.0, 40.0}));  // Saída: Valor total: 60.0 | Valor de descontos: 10.0 | Valor a pagar: 50.0
        System.out.println(geraRecibo(new double[]{20.0, 40.0, 30.0}));  // Saída: Valor total: 90.0 | Valor de descontos: 10.0 | Valor a pagar: 80.0
        System.out.println(geraRecibo(new double[]{90.0, 80.0, 60.0, 40.0}));  // Saída: Valor total: 200.0 | Valor de descontos: 10.0 | Valor a pagar: 190.0
    }
}
