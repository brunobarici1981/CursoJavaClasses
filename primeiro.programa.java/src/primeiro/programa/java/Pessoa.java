package primeiro.programa.java;

public abstract class Pessoa {
	
	String nome,dataNascimento,registroGeral,numeroCpf,nomeDaMae,nomeDoPai;
	int idade;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Pessoa(String nome, String dataNascimento, String registroGeral, String numeroCpf, String nomeDaMae,
			String nomeDoPai, int idade, double salario) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.registroGeral = registroGeral;
		this.numeroCpf = numeroCpf;
		this.nomeDaMae = nomeDaMae;
		this.nomeDoPai = nomeDoPai;
		this.idade = idade;
		this.salario = salario;
	}
	 public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	 
	double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral
				+ ", numeroCpf=" + numeroCpf + ", nomeDaMae=" + nomeDaMae + ", nomeDoPai=" + nomeDoPai + ", idade="
				+ idade + "]";
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	public String getNomeDoPai() {
		return nomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean pessoaMaiorIdade(){
		return idade >= 18;
	}
	public abstract double salario();
	public abstract String TarefaSemanal();
    
}

