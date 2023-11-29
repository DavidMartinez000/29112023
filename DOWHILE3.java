import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DOWHILE3 {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        Scanner scnFruta = new Scanner(System.in);
        Scanner scnSair = new Scanner(System.in);
        String fruta;
        String saida;
        boolean sair = false;
        while(sair == false) {

        
        System.out.println("Digite o nome de uma fruta");
        fruta = scnFruta.nextLine();
        if (fruta !=""){
            frutas.add(fruta);
        } else {
            System.out.println("Digite um nome valido");
        }
        System.out.println("Deseja digitar mais algum nome de fruta?");
        System.out.println("Digite S ou s para continuar ou digite N ou n para sair");
        saida = sncSair.nextLine();
        if (saida.equals("N") || saida.equals("n")) {
            break;

        }
    }
    System.out.println("Foram adiciondas " + frutas.size() + " frutas, quais seja: " + frutas);
}
}
