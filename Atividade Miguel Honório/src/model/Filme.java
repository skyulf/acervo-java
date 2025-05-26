package model;

public class Filme extends Midia {
    public Filme(String titulo){
        super(titulo, "Filme");
    }

    @Override
    public void mostrarinformacoes() {
        System.out.println("[Filme]"+titulo+" | Disponível:"+ disponivel +" |Assitido: " +assistido);

        }
}
