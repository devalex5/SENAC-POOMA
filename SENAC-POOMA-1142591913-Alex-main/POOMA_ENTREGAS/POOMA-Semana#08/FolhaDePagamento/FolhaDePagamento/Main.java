package FolhaDePagamento;
public class Main {
    public static void main(String[] args) {
        	Funcionario func = new Funcionario();
        	Horista horista = new Horista();
        	horista.calcularSalarioHorista(120);
        	horista.imprimirPagamento();
        	Mensalista mensalista = new Mensalista();
        	mensalista.calcularSalarioMes();
        	mensalista.imprimirPagamento();
        	Tarefeiro tarefeiro = new Tarefeiro();
        	tarefeiro.calcularSalarioMes();
        	tarefeiro.imprimirPagamento();
    }
}