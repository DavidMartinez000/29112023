import java.util.Scanner;

public class IFELSE1 {
    public static void main(String[] args) {
    
    String vUser = "teste";
    String vPass = "teste";

    Scanner scnUser = new Scanner(System.in);
    System.out.println("Digite o nome do usuario (login)");
    String user = scnUser.nextLine();

    Scanner scnPass = new Scanner(System.in);
    System.out.println("Digite a senha do usuario");
    String pass = scnPass.nextLine();
    if (user.equals(vUser) && pass.equals(vPass)) {
        System.out.println("Bem vindo ao sistema");
    } else {
        System.out.println("Usuario ou senha invalidos");
    }
    scnUser.close();
    scnPass.close();
}
  }
