package primeiro.programa.java;

import primeiro.programa.java.Diretor;

import javax.swing.JOptionPane;

import primeiro.programa.java.Aluno;
import primeiro.programa.java.Secretario;
import primeiro.programa.java.Pessoa;

public class TestarClasses {

	public static void main(String[] args) {
        
		try{
		if (new Secretario().autenticar(JOptionPane.showInputDialog("Digite seu login"),
				JOptionPane.showInputDialog("Digite sua senha")))

			JOptionPane.showMessageDialog(null, "autorizado");
		else {
			JOptionPane.showMessageDialog(null, "Nao permitido acesso");

		}
		}catch(Exception e) {
			JOptionPane.showInternalMessageDialog(null, e.getClass());	
		}finally {
			
		}
		 StringBuilder nome = new StringBuilder();
		nome.append("bruno ");
		nome.append("barici ");
		nome.append("trindade");
		
		JOptionPane.showMessageDialog(null, nome);
	}
}