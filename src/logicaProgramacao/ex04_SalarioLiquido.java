package logicaProgramacao;

import javax.swing.JOptionPane;

public class ex04_SalarioLiquido {
	public static void main(String[] args) {
		Float horas,dependentes,salarioBruto,salarioLiquido,ir,inss;
		String nome;
		
		nome = JOptionPane.showInputDialog("Informe seu nome");
		//dependentes = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de dependentes "));
		horas = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas no mês"));
		
		salarioBruto = (26.60f * horas);
		ir = salarioBruto * 0.05f;
		inss = salarioBruto * 0.085f;
		salarioLiquido = salarioBruto + ir + inss;
				
		JOptionPane.showMessageDialog(null, "Nome = " + nome +
											"\nHoras Trabalhadas = " + horas +
											"\nSalário Bruto = " + salarioBruto + 
											"\nSalário Liquido = " + salarioLiquido +
											"\nir = " + ir +
											"\ninss = " + inss);
	}
}
