
class Veicolo  {
    private String marca="Fiat";

    public void stampaDettagli() {
        System.out.println("La marca è " + marca);
    }
}

public class VeicoloMain {

    public static void main(String[] args) {
        Veicolo oggetto = new Veicolo();
        oggetto.stampaDettagli();
    }

}