package primeiro.programa.java;

public class Diretor extends Pessoa{

String RegistroEducacao,tempoDirecao,titulacao;

public Diretor(String nome, String dataNascimento, String registroGeral, String numeroCpf, String nomeDaMae,
		String nomeDoPai, int idade, double salario, String registroEducacao, String tempoDirecao, String titulacao) {
	super(nome, dataNascimento, registroGeral, numeroCpf, nomeDaMae, nomeDoPai, idade, salario);
	RegistroEducacao = registroEducacao;
	this.tempoDirecao = tempoDirecao;
	this.titulacao = titulacao;
}

public String getRegistroEducacao() {
	return RegistroEducacao;
}

public void setRegistroEducacao(String registroEducacao) {
	RegistroEducacao = registroEducacao;
}

public String getTempoDirecao() {
	return tempoDirecao;
}

public void setTempoDirecao(String tempoDirecao) {
	this.tempoDirecao = tempoDirecao;
}

public String getTitulacao() {
	return titulacao;
}

public void setTitulacao(String titulacao) {
	this.titulacao = titulacao;
}

@Override
public String toString() {
	return "Diretor [RegistroEducacao=" + RegistroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
			+ titulacao + "]";
}
@Override
	public boolean pessoaMaiorIdade() {
		
		return super.pessoaMaiorIdade();
	}

@Override
public double salario() {
	// TODO Auto-generated method stub
	return 200;
}

@Override
public String TarefaSemanal() {
	// TODO Auto-generated method stub
	return null;
}
}
