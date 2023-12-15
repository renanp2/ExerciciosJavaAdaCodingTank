package ExerciciosAula03.Condicionais;

public class Questao01 {

    public static String mediaAproveitamento(double[] input) {
        double n1 = input[0];
        double n2 = input[1];
        double n3 = input[2];
        double mediaExercicios = input[3];

        double mediaGeral = ((n1*1) + (n2*2) + (n3*3) + mediaExercicios)/7;
        if(mediaGeral >= 9.0){
            return"A";
        }else if(mediaGeral < 9.0 && mediaGeral >= 7.5){
            return"B";
        }else if(mediaGeral < 7.5 && mediaGeral >= 6.0){
            return"C";
        }else if(mediaGeral < 6.0){
            return"D";
        }else{
            return "Nota inválida";
        }
    }

        //Condicionais e Operadores
    //Uma professora está precisando de ajuda para calcular a nota de seus alunos. Os seus critérios de avaliação usam um sistema de notas ponderadas. Cada aluno possui 3 notas e também uma média de exercícios. Baseados nessas notas é calculado a média de aproveitamento seguindo a formula abaixo:
    //
    //media_aproveitamento = (N1 + N22 + N33 + media_exercicios)/7
    //
    //Após a obtenção de média de aproveitamento do aluno é determinado o conceito dele, seguindo os seguintes critérios:
    //
    //média >= 9,0 => conceito A
    //média >= 7,5 e < 9,0 => conceito B
    //média >= 6,0 e < 7,5 => conceito C
    //média < 6,0 => conceito D
    //Para ajudar a professora com a sua turma, crie uma função que receba um array com as notas dos alunos (as três primeiras notas correspondem a N1, N2 e N3 e a última posição, a médias dos exercícios) e calcule a média de aproveitamento e retorne o conceito que o aluno obteve.
    //
    //Ex:
    //Entrada: [8.0, 7.0, 8.0, 8.0]
    //Saída: B
    //
    //Ex:
    //Entrada: [5.0, 4.3, 8.0, 7.0]
    //Saída: C

}
