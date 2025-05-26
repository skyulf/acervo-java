package model;

public class Documentario extends Midia {
    public Documentario(String titulo) {
        super(titulo,"Documentario");
    }
    @Override
    public void mostrarinformacoes() {
        System.out.println("[Documentario]"+titulo+" | Disponível:"+ disponivel +" |Assitido: " +assistido);
    }
}
