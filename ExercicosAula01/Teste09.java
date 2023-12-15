package ExercicosAula01;

public class Teste09 {
    public static boolean eUmTriangulo(int[] input) {

        int lado1 = input[0];
        int lado2 = input[1];
        int lado3 = input[2];

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)){
        return true;
        }
        return false;
    }
}
