package model;

public abstract class Midia {
    protected String titulo;
    protected String tipo;
    protected boolean disponivel;
    protected boolean assistido;

    public Midia(String titulo, String tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.disponivel = true;
        this.assistido = false;
    }
    public String getTitulo() { return titulo; }
    public String getTipo() { return tipo; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) {this.disponivel = disponivel;}
    public boolean isAssistido() { return assistido; }
    public void setAssistido(boolean assistido) { this.assistido = assistido; }

    public abstract void mostrarinformacoes();
}
