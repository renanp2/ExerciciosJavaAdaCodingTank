package ExerciciosAula03.Condicionais;

public class Questao03Continuacao {
    public static double valorEntrada(double[] input) {

        double valorEntrada = input[1];
        double desconto = valorEntrada + (valorEntrada * 0.15);
        double desconto1 = valorEntrada - (valorEntrada * 0.15);;
        double desconto2 = valorEntrada - (valorEntrada * 0.25);
        double desconto3 = desconto2 + desconto1;


        if(input[2] == 1.0){
            if(input[0] == 1.0 || input[0]== 2.0 || input[0] == 4.0){
                return desconto3;
            }else {
                return desconto;
            }
        }
        return valorEntrada ;
    }

    public static void main(String[] args) {
        System.out.println(valorEntrada(new double[]{4.0,50.00,1.0}));
    }
}
