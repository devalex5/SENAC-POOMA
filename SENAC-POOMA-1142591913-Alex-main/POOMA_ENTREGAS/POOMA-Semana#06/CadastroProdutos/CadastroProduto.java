package CadastroProdutos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class CadastroProduto {
    private int id;
    private int classificacao;
    private String nomeProduto;
    private double precoProduto;

    public CadastroProduto(int id, int classificacao, String nomeProduto, double precoProduto) {
        this.id = id;
        this.classificacao = classificacao;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public static void main(String[] args) {
        ArrayList<CadastroProduto> listaProdutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Incluir produto");
            System.out.println("2 - Consultar produto");
            System.out.println("3 - Excluir produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Listar todos os produtos");
            System.out.println("6 - Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                   
                    System.out.println("Informe o ID:");
                    int id = scanner.nextInt();
                    System.out.println("Informe a classificação:");
                    int classificacao = scanner.nextInt();
                    System.out.println("Informe o nome do produto:");
                    String nome = scanner.next();
                    System.out.println("Informe o preço do produto:");
                    double preco = scanner.nextDouble();

                    CadastroProduto novoProduto = new CadastroProduto(id, classificacao, nome, preco);
                    listaProdutos.add(novoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    
                    System.out.println("Informe o ID do produto a ser consultado:");
                    int idConsulta = scanner.nextInt();
                    for (CadastroProduto produto : listaProdutos) {
                        if (produto.getId() == idConsulta) {
                            System.out.println("Produto encontrado:");
                            System.out.println("ID: " + produto.getId());
                            System.out.println("Classificação: " + produto.getClassificacao());
                            System.out.println("Nome: " + produto.getNomeProduto());
                            System.out.println("Preço: " + produto.getPrecoProduto());
                            break;
                        }
                    }
                    break;
                case 3:
                    
                    System.out.println("Informe o ID do produto a ser excluído:");
                    int idExclusao = scanner.nextInt();
                    Iterator<CadastroProduto> iterator = listaProdutos.iterator();
                    while (iterator.hasNext()) {
                        CadastroProduto produto = iterator.next();
                        if (produto.getId() == idExclusao) {
                            iterator.remove();
                            System.out.println("Produto excluído com sucesso!");
                            break;
                        }
                    }
                    break;
                case 4:
                    
                    System.out.println("Informe o ID do produto a ser alterado:");
                    int idAlteracao = scanner.nextInt();
                    for (CadastroProduto produto : listaProdutos) {
                        if (produto.getId() == idAlteracao) {
                            System.out.println("Informe a nova classificação:");
                            int novaClassificacao = scanner.nextInt();
                            System.out.println("Informe o novo nome do produto:");
                            String novoNome = scanner.next();
                            System.out.println("Informe o novo preço do produto:");
                            double novoPreco = scanner.nextDouble();

                            produto.setClassificacao(novaClassificacao);
                            produto.setNomeProduto(novoNome);
                            produto.setPrecoProduto(novoPreco);
                            System.out.println("Produto alterado com sucesso!");
                            break;
                        }
                    }
                    break;
                case 5:
                    
                    System.out.println("Lista de Produtos:");
                    for (CadastroProduto produto : listaProdutos) {
                        System.out.println("ID: " + produto.getId());
                        System.out.println("Classificação: " + produto.getClassificacao());
                        System.out.println("Nome: " + produto.getNomeProduto());
                        System.out.println("Preço: " + produto.getPrecoProduto());
                        System.out.println();
                    }
                    break;
                case 6:
                   
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
