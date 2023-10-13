package OrientacaoObjeto;

public class Cliente {
    private String nome;
    private String telefone;
    private String senha;

    public Cliente(String nome, String telefone, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
}
