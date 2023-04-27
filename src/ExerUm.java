import java.util.Scanner;
public class ExerUm {
    public static void main(String[] args) {
        int vetor[] = {32,12,45,20,1};
        int soma = 0;
        for(int contador = 0; contador < vetor.length; contador++) {
            soma = soma + vetor [contador];

        }
        System.out.println(soma);
    }
}
