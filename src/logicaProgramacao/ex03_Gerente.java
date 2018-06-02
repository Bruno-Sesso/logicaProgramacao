package logicaProgramacao;

import javax.swing.JOptionPane;

public class ex03_Gerente {

	public static void main(String[] args) {
		float entrada, prestacao, valor;
		
		try {
			valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do produto"));
			
			// (int) valor / 3 + valor % 3 = fazendo cache, para dividir o valor por inteiro
			// e somar com o resto da divisao
			
			entrada = (int) valor / 3 + valor % 3;
			
			// (int) valor / 3 = fazendo cache, para dividir o valor por inteiro
			prestacao = (int) valor / 3;
			
			JOptionPane.showMessageDialog(null, "Valor de entrada = " + entrada + 
					"\nValor da prestação = " + prestacao);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Para valores quebrados informar com ponto(.)");
		}
	}

}
