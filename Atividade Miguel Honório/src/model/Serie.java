package model;

public class Serie extends Midia {
    public Serie (String titulo){
        super(titulo, "Serie");
    }

    @Override
    public void mostrarinformacoes() {
        System.out.println("[Serie]"+titulo+" | Disponível:"+ disponivel +" |Assitido: " +assistido);

    }
}
