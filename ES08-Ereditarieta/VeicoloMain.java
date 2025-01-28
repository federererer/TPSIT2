
class Veicolo  {
    private String marca="Fiat";
    private String modello="cinquecento";
    public void stampaDettagli() {
        System.out.println("La marca è " + marca);
        System.out.println("Il modello è " + modello);
    }
}

public class VeicoloMain {

    public static void main(String[] args) {
        Veicolo oggetto = new Veicolo();
        oggetto.stampaDettagli();
    }

}