package ExerciciosAula03.Lacos;

import org.w3c.dom.ls.LSOutput;

public class Questao01 {
    public static String geraSequenciaFibonacci(int input) {
        if (input < 0) {

            return "0";
        }
        int posicao1 = 0;
        int posicao2 = 1;
        int resultadoSoma = 0;
        while (posicao1 < input){
            System.out.print(posicao1 + ", ");

            resultadoSoma = posicao1 + posicao2;
            posicao1 = posicao2;
            posicao2 = resultadoSoma;
        }
        return " ";
    }
    public static void main(String[] args) {
        System.out.println(geraSequenciaFibonacci(4));
    }
}
