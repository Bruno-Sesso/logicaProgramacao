package logicaProgramacao;

import javax.swing.JOptionPane;

public class ex04_ValorMaior {
	public static void main(String[] args) {
		int valor1, valor2;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor "));
		
		if(valor1 > valor2)
			JOptionPane.showMessageDialog(null, "Valor maior : " + valor1 + 
												"/nValor menor : " + valor2);
		else
			JOptionPane.showMessageDialog(null, "Valor maior : " + valor2 + 
					"\nValor menor : " + valor1);
	}
}
