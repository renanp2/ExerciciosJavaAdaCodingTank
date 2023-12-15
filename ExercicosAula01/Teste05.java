package ExercicosAula01;

public class Teste05 {
    public static void main(String[] args) {
        int resultado = idadeEmDias(new int[]{5,6,12});
        System.out.println(resultado);


    }
    public static int idadeEmDias( int[] input) {
    int anosDeVida = input[0];
    int mesesDeVida = input[1];
    int diasDeVida = input[2];


    int totalDiasDeVida = (anosDeVida * 365) + (mesesDeVida * 30) + diasDeVida;
        return totalDiasDeVida;
    }
}


