package OrientacaoObjeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDemandas gerenciador = new GerenciadorDemandas();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Registrar Cliente");
            System.out.println("2 - Adicionar Demanda");
            System.out.println("3 - Visualizar Demanda por Código");
            System.out.println("4 - Deletar Demanda por Código");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.next();
                    System.out.print("Digite o telefone do cliente: ");
                    String telefone = scanner.next();
                    System.out.print("Digite a senha do cliente: ");
                    String senha = scanner.next();
                    gerenciador.adicionarCliente(nome, telefone, senha);
                    System.out.println("Cliente registrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.next();
                    System.out.print("Digite a senha do cliente: ");
                    String senhaCliente = scanner.next();
                    System.out.print("Digite a descrição da demanda: ");
                    String descricao = scanner.next();
                    System.out.print("A demanda é urgente? (true/false): ");
                    boolean urgente = scanner.nextBoolean();
                    int codigoDemanda = gerenciador.registrarDemanda(nomeCliente, senhaCliente, descricao, urgente);
                    if (codigoDemanda != -1) {
                        System.out.println("Demanda registrada com sucesso! Código da Demanda: " + codigoDemanda);
                    } else {
                        System.out.println("Cliente não encontrado ou senha incorreta. Não foi possível registrar a demanda.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o código da demanda: ");
                    int codigoVisualizacao = scanner.nextInt();
                    Demanda demanda = gerenciador.visualizarDemanda(codigoVisualizacao);
                    if (demanda != null) {
                        System.out.println("Demanda: " + demanda.getDescricao());
                    } else {
                        System.out.println("Demanda não encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o código da demanda a ser deletada: ");
                    int codigoDeletar = scanner.nextInt();
                    gerenciador.deletarDemanda(codigoDeletar);
                    System.out.println("Demanda deletada com sucesso!");
                    break;
                case 5:
                    System.out.println("Saindo do programa. Até mais!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
