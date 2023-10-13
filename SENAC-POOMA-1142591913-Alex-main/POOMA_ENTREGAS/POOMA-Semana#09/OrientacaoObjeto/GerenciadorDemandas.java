package OrientacaoObjeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorDemandas {
    private ArrayList<Cliente> clientes;
    private Map<Integer, Demanda> demandas;
    private int codigoDemanda;

    public GerenciadorDemandas() {
        clientes = new ArrayList<>();
        demandas = new HashMap<>();
        codigoDemanda = 1;
    }

    public void adicionarCliente(String nome, String telefone, String senha) {
        Cliente cliente = new Cliente(nome, telefone, senha);
        clientes.add(cliente);
    }

    public int registrarDemanda(String nome, String senha, String descricao, boolean urgente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome) && cliente.getSenha().equals(senha)) {
                Demanda demanda;
                if (urgente) {
                    demanda = new DemandaUrgente(descricao);
                } else {
                    demanda = new Demanda(descricao);
                }
                demandas.put(codigoDemanda, demanda);
                return codigoDemanda++;
            }
        }
        return -1; // Cliente não encontrado ou senha incorreta
    }

    public Demanda visualizarDemanda(int codigoDemanda) {
        return demandas.get(codigoDemanda);
    }

    public void deletarDemanda(int codigoDemanda) {
        demandas.remove(codigoDemanda);
    }
}
