public class DOWHILE1 {
    public static void main(String[] args) {

    
     int totalTempo = 2;
     int inicoTempo = 0;

    while (inicoTempo <= totalTempo) {
        try {
            System.out.println("Assistindo filme...");
            Thread.sleep(6000);
        }catch (InterruptedException e) {
            System.out.println("Ops! Houve algum erro...: " + e);
        }
        System.out.println("Fim do filme");
    
    }
  }
}
