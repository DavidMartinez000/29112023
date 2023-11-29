import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DOWHILE2 {
    public static void main(String[] args) {
        List<String> userLogged = new ArrayList<>();
        String[] usuariosLogados = {"teste1","teste2","..."};
        usuariosLogados[3] ="teste4"; //crio uma nova matriz
        usuariosLogados[2] = "Substituir a string..."; // substuo a matriz 2

        List<String> usersLogged = new ArrayList<>();
        int limitUsers = 2;
        Scanner scnUser = new Scanner(System.in);
        String usuario;
        while (usersLogged.size()< limitUsers) {
            System.out.println("Digite o usuario"); 
            usuario = scnUser.nextLine();
            if(usuario != "") {
                usersLogged.add(usuario);
            } else {
                System.out.println("Digite um usuario valido");
            }
            Thread.sleep(1000);
        }
        System.out.println("Limite de usuarios excedio");
    } catch (InterruptedException e) {
        System.out.println("Ops! Houve algum erro...: " + e);
    }
    scn.close();
}
