package logicaProgramacao;

import javax.swing.JOptionPane;

public class ex05_2notasBimestrais {

	public static void main(String[] args) {
		String nome, resultado;
		
		float nota, soma=0, media;
		
		nome = JOptionPane.showInputDialog("Digite o nome");
		resultado = "Aluno: " + nome;
		
		for(int i=1; i<=4; i++) {
			nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota " + i));
			soma = soma+nota;
			resultado += "\nNota" + i + " = " + nota;
		}
		
		media = soma/4;
		
		if(media >= 7)
			resultado += "\nAluno aprovado com a média " + media;
		else
			resultado += "\nAluno reprovado com a média " + media;
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
