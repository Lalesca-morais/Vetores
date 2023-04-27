import java.util.Scanner;
public class ExerQuatro {
    public static void principal(String[] args) {
        Scanner valorDigitado = new Scanner(System.in);
        int qtlista;
        System.out.println("Digite quantidade de itens que quer adicionar: ");
        qtlista = valorDigitado.nextInt();
        String[] itens = new String[qtlista];
        for (int i = 0; i < qtlista; i++) {

            System.out.println("Insira os produtos: ");
            itens[i] = valorDigitado.next();
        }
        System.out.println("----------- LISTA DE COMPRAS ------------");
        for (int i = 0; i < itens.length; i++){
            itens[2] = null;
            System.out.println("posição "+ i+ " - " +itens[i]);
        }


    }
}

