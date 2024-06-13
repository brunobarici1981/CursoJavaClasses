package primeiro.programa.java;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro, nivelDeCargo, experiencia,login,senha;
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
public Secretario() {
		super();
	}


	public Secretario(String nome, String dataNascimento, String registroGeral, String numeroCpf, String nomeDaMae,
			String nomeDoPai, int idade, double salario, String registro, String nivelDeCargo, String experiencia) {
		super(nome, dataNascimento, registroGeral, numeroCpf, nomeDaMae, nomeDoPai, idade, salario);
		this.registro = registro;
		this.nivelDeCargo = nivelDeCargo;
		this.experiencia = experiencia;
	}

	
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelDeCargo() {
		return nivelDeCargo;
	}

	public void setNivelDeCargo(String nivelDeCargo) {
		this.nivelDeCargo = nivelDeCargo;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelDeCargo=" + nivelDeCargo + ", experiencia=" + experiencia
				+ "]";
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
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
   
	@Override
	public boolean autenticar(String login,String senha) {
		
		return login.equals("admin")&&senha.equals("admin");
	}
    
}
