package FolhaDePagamento;

public class Horista extends Funcionario {
private double valorHora;
private int qtdHorasTrabalhadas;
private double salarioliquido;
//
public Horista() {
this.valorHora = 100.00;
}
public double getValorHora() {
return valorHora;
}
public void setValorHora(double valorHora) {
this.valorHora = valorHora;
}
public int getQtdHorasTrabalhadas() {
return qtdHorasTrabalhadas;
}
public void setQtdHorasTrabalhadas(int qtdHorasTrabalhadas) {
this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
}

public double getSalarioliquido() {
return salarioliquido;
}
public void setSalarioliquido(double salarioliquido) {
this.salarioliquido = salarioliquido;
}
public void calcularSalarioHorista(int qtdHorasTrabalhadas) {
setSalarioliquido(this.valorHora * qtdHorasTrabalhadas);
}
public void imprimirPagamento() {
System.out.println("O funcionario : "+super.nomeFuncionario);
System.out.println("Trabalha no Departamento : "+super.nomeDepartamento);
System.out.println("Sua funcao é: "+super.funcao);
System.out.println("O salario do funcionario é: "+this.salarioliquido+"\n");

}
}