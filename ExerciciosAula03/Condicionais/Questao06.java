package ExerciciosAula03.Condicionais;

public class Questao06 {
    public static double calculoSalario( double[] input) {
        double resultado;
        if(input[0] >=1 && input[0]<5){
            resultado = (input[2]+ input[2] * (1 + input[1])/100);
            return Math.round(100.0 * resultado) /100.0;
        }
        else if(input[0] >=5 && input[0] < 10){
            resultado = (input[2]+ input[2] * (1.5 + input[1])/100);
            return Math.round(100.0 * resultado) /100.0;
        }
        else if(input[0] >= 10 ){
            resultado = (input[2]+ input[2] * (2 + input[1])/100);
            return Math.round(100.0 * resultado) /100.0;
        }
        else{
            resultado = (input[2]+ input[2] * input[1]/100);
            return Math.round(100.0 * resultado) /100.0;
        }
    }
}
