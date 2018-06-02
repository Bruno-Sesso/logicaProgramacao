package logicaProgramacao;

import javax.swing.JOptionPane;

public class ex01_Salario {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu Nome"); 
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		String cargo = JOptionPane.showInputDialog("Digite seu cargo");
		float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salário bruto"));
		
		double reajuste = 0.38 * salarioBruto;
		double gratificacao = 0.20 * salarioBruto;
		double salarioTotal = salarioBruto + reajuste + gratificacao;
		double salarioLiquido = salarioTotal - 0.15* salarioTotal;
		
		JOptionPane.showMessageDialog(null, "Nome = " + nome +
				"\nIdade = " + idade +
				"\nCargo =  " + cargo +
				"\nSalário Bruto = " + salarioBruto +
				"\nSalário Líquido = " + salarioLiquido +
				"\nSalário Total = "+ salarioTotal);
	}
}
