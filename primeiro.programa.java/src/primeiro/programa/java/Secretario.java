package primeiro.programa.java;

public class Secretario extends Pessoa {

	String registro, nivelDeCargo, experiencia;

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
}
