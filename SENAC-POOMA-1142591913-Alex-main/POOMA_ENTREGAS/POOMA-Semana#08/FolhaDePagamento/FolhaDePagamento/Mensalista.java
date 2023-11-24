package FolhaDePagamento;

public class Mensalista extends Funcionario {
    private double salarioMensal;

    public Mensalista() {
        this.salarioMensal = 1200.00;
    }

    // Getter e setter para o salário mensal
    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    // Método para calcular o salário do mês
    public double calcularSalarioMes() {
        return this.salarioMensal;
    }

    // Método para imprimir o pagamento
    public void imprimirPagamento() {
    	System.out.println("O funcionario : "+super.nomeFuncionario);
    	System.out.println("Trabalha no Departamento : "+super.nomeDepartamento);
    	System.out.println("Sua funcao é: "+super.funcao);
    	System.out.println("O salario do funcionario é: "+this.salarioMensal+"\n");
    }
}
