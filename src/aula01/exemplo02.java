package aula01;
import javax.swing.JOptionPane;

public class exemplo02 {
	

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
		
		String idadeString= JOptionPane.showInputDialog(null, "Digite a sua idade: ");
		int idade = Integer.parseInt(idadeString);
		String alturaString= JOptionPane.showInputDialog(null, "Digite a sua altura(exemplo: 1.75): ");
		double altura = Double.parseDouble(alturaString);
		String casadoString= JOptionPane.showInputDialog(null, "É casado? : ");
		boolean casado = casadoString.equalsIgnoreCase("sim");
		String mensagemFinal = "Informações inseridas: "+"\nNome: "+nome+
				"\nIdade: "+idade+" anos"+"\nAltura: "+altura+" m"+
				"\nCasado: "+(casado?"sim":"nao");
		JOptionPane.showMessageDialog(null, mensagemFinal, "Dados do usuário",
				JOptionPane.INFORMATION_MESSAGE); 
		
	}
}