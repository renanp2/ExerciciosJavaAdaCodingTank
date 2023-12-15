package ExerciciosAula04;

import java.util.Scanner;

public class AtividadeAula02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual tamanho do quadrado: ");
        int quadrado = input.nextInt();

        int [][] matriz = new int[quadrado][quadrado];

        for (int i = 0; i <= matriz.length;i++){
            System.out.println();
            for (int j = 0; j <= matriz.length;j++){
                System.out.print(" # ");
            }
        }

    }
}
