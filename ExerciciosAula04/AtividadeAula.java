package ExerciciosAula04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AtividadeAula {
    public static void main(String[] args) {
        //Capturando os valores no teclado
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da Compra: ");
        double valorCompra = input.nextDouble();
        System.out.println("Digite a porcentagem do desconto: ");
        double descontoPorcento = input.nextDouble();

        //Aplicando o desconto dentro de uma variávell
        double valorTotalAPagar = valorCompra - (valorCompra * (descontoPorcento/100));

        System.out.println("Tabela de parcelamento:");
        System.out.println("-----------------------------");

        double parcelasDaCompra = valorTotalAPagar/3;

        //Exibindo os valores dentro do loop
        for (int i = 1; i <= 3; i++){
            System.out.printf("Parcela %d | Valor: R$ %.2f | Saldo devedor: R$ %.2f\n",i,parcelasDaCompra,valorTotalAPagar-(parcelasDaCompra*i));
        }

        System.out.println("--------------------------");

        System.out.println("Total pago: "+valorTotalAPagar);
        System.out.println("Valor total sem desconto: "+valorCompra);

        //Atividade: Cálculo de Desconto em Compras
        //Peça ao usuário as seguintes informações:
        //O valor total da compra.
        //O percentual de desconto a ser aplicado.
        //Com base nessas informações, crie um programa que calcule o valor do desconto, o valor total com desconto e exiba esses resultados
        // para o usuário. Além disso, mostre uma tabela com a evolução do saldo devedor a cada mês, considerando um parcelamento em 3 vezes.
    }
}
