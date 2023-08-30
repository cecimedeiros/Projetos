package Front;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Facade f = new Facade();
        Boolean parada = false;

        System.out.println("Bem vindo ao seu bloco de notas!");
        System.out.println();

        do {

            System.out.println("Menu:\n" +
                    "1. Adicionar nota\n" +
                    "2. Ver bloco de Notas\n" +
                    "3. Editar nota\n" +
                    "4. Buscar notas por conteúdo\n" +
                    "5. Excluir nota\n" +
                    "6. Ver lixeira\n" +
                    "7. Recuperar nota\n" +
                    "8. Sair");

            int respMenu = Integer.parseInt(sc.nextLine());
            System.out.println();

            if ((respMenu < 1) || (respMenu > 8)){
                System.out.println("Opção inexistente");
                System.out.println();
            }

            if (respMenu == 1){

                System.out.println("Insira conteúdo da nota");
                String cn = sc.nextLine();
                f.adicionarNota(cn);

            } else if (respMenu == 2){

                f.mostrarBlocoDeNotas();

            } else if (respMenu == 3) {

                System.out.println("Insira o ID da nota que deseja editar:");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Insira o novo conteúdo da nota:");
                String cont = sc.nextLine();
                f.editarNota(cont, id);

            } else if (respMenu == 4){

                System.out.println("Insira o trecho que deseja pesquisar:");
                String tc = sc.nextLine();
                System.out.println(f.buscarNotasPorTrecho(tc));

            } else if (respMenu == 5){

                System.out.println("Insira o ID da nota que deseja excluir:");
                int id = Integer.parseInt(sc.nextLine());
                f.removerNota(id);

            } else if (respMenu == 6){

                f.mostrarLixeira();

            } else if (respMenu == 7){

                System.out.println("Insira o ID, na lixeira, da nota que deseja recuperar:");
                int id = Integer.parseInt(sc.nextLine());
                f.recuperarNotaDaLixeira(id);

            } else if (respMenu == 8){

                parada = true;

            }

        } while(!parada);

        sc.close();

    }
}