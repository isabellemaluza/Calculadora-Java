package aula01;
import javax.swing.JOptionPane;
public class calculadora {

	public static void main(String[] args) {
		String num1String = JOptionPane.showInputDialog(null,"Digite o primeiro valor:");
		String operacao = JOptionPane.showInputDialog(null,"Digite a operação (+,-,*,/):");
		String num2String = JOptionPane.showInputDialog(null,"Digite o segundo valor:");
		double resultado=0;
		double num1 = Double.parseDouble(num1String);
		double num2 = Double.parseDouble(num2String);
		switch(operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			if(num2==0) {
				JOptionPane.showConfirmDialog(null, "Erro: Divisão por zero.", "Erro",JOptionPane.ERROR_MESSAGE);
			}
			resultado = num1 / num2;
			break;
			default:
				JOptionPane.showConfirmDialog(null, "Operação inválida","Erro", JOptionPane.ERROR_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, "O resultado é:" +resultado, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
