package primeiro.programa.java;


public class Aluno extends Pessoa {
	

	String dataDaMatricula,nomeDaEscola,serieMatriculado,disciplinas;
	
	public Aluno(String nome, String dataNascimento, String registroGeral, String numeroCpf, String nomeDaMae,
			String nomeDoPai, int idade, double salario, String dataDaMatricula, String nomeDaEscola,
			String serieMatriculado, String disciplinas) {
		super(nome, dataNascimento, registroGeral, numeroCpf, nomeDaMae, nomeDoPai, idade, salario);
		this.dataDaMatricula = dataDaMatricula;
		this.nomeDaEscola = nomeDaEscola;
		this.serieMatriculado = serieMatriculado;
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Aluno [dataDaMatricula=" + dataDaMatricula + ", nomeDaEscola=" + nomeDaEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}

	public String getDataDaMatricula() {
		return dataDaMatricula;
	}

	public void setDataDaMatricula(String dataDaMatricula) {
		this.dataDaMatricula = dataDaMatricula;
	}

	public String getNomeDaEscola() {
		return nomeDaEscola;
	}

	public void setNomeDaEscola(String nomeDaEscola) {
		this.nomeDaEscola = nomeDaEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public boolean pessoaMaiorIdade() {
		
		return super.pessoaMaiorIdade();
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String TarefaSemanal() {
		// TODO Auto-generated method stub
		return null;
	}
}
