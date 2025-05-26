package service;

import model.Midia;
import java.util.ArrayList;
import java.util.List;



public class AcervoService {
    private List<Midia> midias = new ArrayList<>();
 public void cadastrarMidia(Midia midia) {
     midias.add(midia);
 }

    public void listarMidias() {
        System.out.println("Acervo de Mídias");
        for(Midia m :midias) {
            m.mostrarinformacoes();
        }
    }
    public void consultarMidia(String titulo){
     for (Midia m :midias){
         if (m.getTitulo().equalsIgnoreCase(titulo)){
             m.mostrarinformacoes();
             return;
         }
     }
     System.out.println("Midia não encontrada");
 }
 public void marcarComoAssitido(String titulo) {
     for (Midia m: midias) {
         if (m.getTitulo().equalsIgnoreCase(titulo)) {
             m.setAssistido(true);
             System.out.println("Midia marcada como assistida");
             return;
         }
     }
     System.out.println("Mídia não encontrada.");
 }

}