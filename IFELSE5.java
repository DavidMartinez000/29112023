import java.util.Scanner;

public class IFELSE5 {
    public static void main(String[] args) {
        int vAlturaMax = 100;
        Scanner scnAltura = new Scanner(System.in);
        System.out.println("Digite a altura do pacote");
        int altura = scnAltura.nextInt();

        if(altura > vAlturaMax) {
            System.out.println("Altura Invalida");
        } else {
            System.out.println("Altura valida");
        }
        scnAltura.close();
    }
}
