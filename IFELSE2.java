import java.util.Scanner;

public class IFELSE2 {
    public static void main(String[] args) {
        Scanner scnNum1 = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = scnNum1.nextInt();
        if (num1 <= 0){
            System.out.println("Digite um numero maior que zero");
            System.exit(0);
        }

        Scanner scnNum2 = new Scanner(System.in);
        System.out.println("Digite o segundo numero");
        int num2 = scnNum1.nextInt();
        if (num2 <= 0) {
            System.out.println("Digite um numero maior que zero");
            System.exit(0);
        }
        System.out.println("A soma dos numeros digitados é: " + (num1 + num2));
        scnNum1.close();
        scnNum2.close();
        
    }
}
