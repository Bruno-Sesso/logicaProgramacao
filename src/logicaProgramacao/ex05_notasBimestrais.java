package logicaProgramacao;

import javax.swing.JOptionPane;

public class ex05_notasBimestrais {

	private static float nota;

	public static void main(String[] args) {
		// Resolução sem loop
		float n1, n2, n3, n4, media;

		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota"));
		n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quarta nota"));

		media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 7)
			JOptionPane.showMessageDialog(null, "Aprovado" + "\nMédia = " + media);

		else
			JOptionPane.showMessageDialog(null, "Reprovado" + "\nMédia = " + media);
	}

}