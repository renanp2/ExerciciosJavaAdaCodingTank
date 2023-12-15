package ExerciciosAula03.Condicionais;

public class Questao02 {
    public static double valorProdutoFinal(double[] input) {
        double valor = input[0];
        double estado = input[1];
        double valorTotal;


        if(estado == 1.0){
            valorTotal = (valor * 0.07) + valor;
            return valorTotal = (Math.round(valorTotal * 10000.0)/10000.0);
        }else if( estado == 2.0){
            valorTotal = (valor * 0.12) + valor;
            return valorTotal = (Math.round(valorTotal * 10000.0)/10000.0);
        } else if (estado == 3.0) {
            valorTotal =  (valor * 0.15) + valor;
            return valorTotal = (Math.round(valorTotal * 10000.0)/10000.0);
        }
        else{
            return -1.0;
        }
    }

    public static void main(String[] args) {
        double resultado = valorProdutoFinal(new double[]{220.50, 3.0});
        System.out.println(resultado);
    }
}
