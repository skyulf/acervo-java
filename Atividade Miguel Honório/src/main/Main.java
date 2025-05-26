package main;

import model.*;
import service.AcervoService;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        AcervoService acervo = new AcervoService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n===== MENU STREAMING =====");
            System.out.println("1 - Cadastrar nova mídia");
            System.out.println("2 - Listar mídias disponíveis");
            System.out.println("3 - Consultar uma mídia");
            System.out.println("4 - Assitir uma mídia");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção:");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao ==0) {
            System.out.println("Encerrando...");
            break;
            }


        switch (opcao){
            case 1:
                System.out.println("Informe o título");
                String titulo = scanner.nextLine();
                System.out.println("Tipo: 1-Filme 2-Série 3-Documentário");
                int tipo = scanner.nextInt();
                scanner.nextLine();

                Midia midia = null;
                if (tipo == 1) midia = new Filme(titulo);
                else if (tipo == 2) midia = new Serie(titulo);
                else if (tipo == 3) midia = new Documentario(titulo);

                if (midia !=null) {
                    acervo.cadastrarMidia(midia);
                    System.out.println("Mídia cadastrada com sucesso");
                    }else{
                    System.out.println("Tipo inválido!");
                }
                break;
            case 2:
                acervo.listarMidias();
                break;

            case 3:
                System.out.println("Informe o título da mídia");
                String consulta = scanner.nextLine();
                acervo.consultarMidia(consulta);
                break;

            case 4:
                System.out.println("Informe o título da mídia: ");
                String assistido = scanner.nextLine();
                acervo.marcarComoAssitido(assistido);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        }
    }
}