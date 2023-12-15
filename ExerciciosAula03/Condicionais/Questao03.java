package ExerciciosAula03.Condicionais;

import java.nio.file.DirectoryNotEmptyException;

public class Questao03 {
    public static double valorEntrada(double[] input) {

        double valorEntrada = input[1];
        double taxaAcrescimo = valorEntrada * 1.15; //acrescimo dos dias que tocam musica ao vivo
        double desconto1 = valorEntrada * 0.75;
        double desconto2 = valorEntrada * 0.75 * 1.15;

        if(input[2] == 1.0){
            if (input[0] == 1.0 || input[0] == 2.0 || input[0] == 4.0){
                return desconto2;
            }

            return taxaAcrescimo;
        }
        if (input[0] == 1.0 || input[0] == 2.0 || input[0] == 4.0){
            return desconto1;
        }
        return valorEntrada;
    }


    public static void main(String[] args) {
        System.out.println(valorEntrada(new double[]{3.0,45.00,2.0}));
    }
}

//Condicionais e Conversão
//Em uma danceteria o preço da entrada sofre variações. Segundas, Terças e Quintas, ela oferece um desconto de 25% do preço normal de entrada. Nos dias de músicas ao vivo, o preço da entrada ainda é acrescido em 15% em relação ao preço normal da entrada. Faça uma função que recebe o dia da semana, o preço normal da entrada e se é dia de música ao vivo (“Sim”) ou não (“Não”). Os valores de entrada serão passados em um array seguindo essa ordem. Calcule e retorne o preço final que deverá ser pago pela entrada. Considere um arredondamento de três casas para o valor final da entrada.
//
//Obs: aplicar primeiro o desconto dos dias com desconto e depois o acréscimo de música ao vivo, quando os dois descontos forem aplicados.
//
//A entrada dos dias da semana será considerando um valor decimal, conforme os dados a seguir:
//
//1.0 - segunda
//2.0 - terça-feira
//3.0 - quarta-feira
//4.0 - quinta-feira
//5.0 - sexta-feira
//6.0 - sábado
//7.0 - domingo
//Para os dados referente a música ao vivo serão considerados: 1.0 - sim e 2.0 - não.
//
//Ex:
//Entrada: [3.0, 25.00, 2.0]
//Saída: 25.000
//
//Ex:
//Entrada: [4.0, 50.00, 1.0]
//Saída: 43.125
