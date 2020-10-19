package controller;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		
		Lista dados = new Lista(5);
		int opcao=0, pos=0;
		while (opcao !=9) {	
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite - 1: Para adicionar no inicio " + "\nDigite - 2: Para adicionar no final " +
					"\nDigite - 3: Para adicionar em posição " + "\nDigite - 4: Para remover do inicio " + "\nDigite - 5: Para remover do final " + 
					"\nDigite - 6: Para remover em posição " + "\nDigite - 7: para exibir \nDigite - 9: para encerrar"));
		
			switch (opcao) {
			
			case 1:
				dados.addInicio(dados.cadastra());
				break;
				
			case 2:
				dados.addFinal(dados.cadastra());
				break;
			
			case 3:
				pos=Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
				dados.addQualquer(dados.cadastra(), pos);
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null, "Removido " + dados.removeInicio());
				break;
				
			case 5:
				JOptionPane.showMessageDialog(null, "Removido " + dados.romoveFinal());
				break;
			
			case 6:
				pos=Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
				JOptionPane.showMessageDialog(null, "Removido " + dados.removeQualquer(pos));
				break;
				
			case 7:
				JOptionPane.showMessageDialog(null, "Pilha \n" + dados.exibe());
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, "Fim");
				break;
			
			default:
				JOptionPane.showMessageDialog(null,"Opção Inválida");
		
		
			}
		
		
		}
		
	}

}