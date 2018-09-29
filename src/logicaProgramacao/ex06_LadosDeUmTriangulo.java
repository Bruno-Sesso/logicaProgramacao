package logicaProgramacao;

import javax.swing.JOptionPane;

public class ex06_LadosDeUmTriangulo {

	public static void main(String[] args) {
		Integer lado1, lado2, lado3;

		lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1"));
		lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2"));
		lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 3"));

		// Triangulo
		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {		
			//Tri�ngulo equil�tero
			if(lado1 == lado2 && lado2 == lado3)
				JOptionPane.showMessageDialog(null, "Tri�ngulo equil�tero");

			//Tri�ngulo is�sceles
			if(lado1 == lado2 & lado1 != lado2 && lado2 != lado3)
				JOptionPane.showMessageDialog(null, "Tri�ngulo is�sceles");
			
			//Tri�ngulo escaleno
			if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3)
				JOptionPane.showMessageDialog(null, "Tri�ngulo escaleno");
		}
		else {
			JOptionPane.showMessageDialog(null, "N�o Triangulo");
		}
			
	}
}
