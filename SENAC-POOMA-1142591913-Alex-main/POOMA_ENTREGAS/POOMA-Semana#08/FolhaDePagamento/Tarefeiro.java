package FolhaDePagamento;

public class Tarefeiro extends Funcionario {
    private double valortarefa;
    private double qtdtarefa;
    private double salarioliquido;

    public Tarefeiro() {
        this.salarioliquido = salarioliquido;
    	this.valortarefa = 1200.00;
        this.qtdtarefa = qtdtarefa;
       	
    }
        
    public double getValortarefa() {
		return valortarefa;
	}
	public void setValortarefa(double valortarefa) {
		this.valortarefa = valortarefa;
	}
	public double getQtdtarefa() {
		return qtdtarefa;
	}
	public void setQtdtarefa(double qtdtarefa) {
		this.qtdtarefa = qtdtarefa;
	}
	
	
	
	public double getSalarioliquido() {
		return salarioliquido;
	}

	public void setSalarioliquido(double salarioliquido) {
		this.salarioliquido = salarioliquido;
	}

	public void calcularSalarioMes() {
		setSalarioliquido(this.qtdtarefa * valortarefa);
    }

    // Método para imprimir o pagamento
    public void imprimirPagamento() {
    	System.out.println("O funcionario : "+super.nomeFuncionario);
    	System.out.println("Trabalha no Departamento : "+super.nomeDepartamento);
    	System.out.println("Sua funcao é: "+super.funcao);
    	System.out.println("O salario do funcionario é: "+this.salarioliquido);
    }
}
