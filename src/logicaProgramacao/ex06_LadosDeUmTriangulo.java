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
			//Triângulo equilátero
			if(lado1 == lado2 && lado2 == lado3)
				JOptionPane.showMessageDialog(null, "Triângulo equilátero");

			//Triângulo isósceles
			if(lado1 == lado2 & lado1 != lado2 && lado2 != lado3)
				JOptionPane.showMessageDialog(null, "Triângulo isósceles");
			
			//Triângulo escaleno
			if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3)
				JOptionPane.showMessageDialog(null, "Triângulo escaleno");
		}
		else {
			JOptionPane.showMessageDialog(null, "Não Triangulo");
		}
			
	}
}
