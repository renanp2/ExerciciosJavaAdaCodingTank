package ExerciciosAula03.Lacos;

public class Questao02 {
    public static int somaAlgarismos(int input) {
        int soma = 0;
        if(input > 0){
            while (input > 0) {
                soma += input % 10; // Adiciona o último algarismo a  soma
                input /= 10;        // Remove o último algarismo do número
            }
            return  soma;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(somaAlgarismos(123));
    }
}
