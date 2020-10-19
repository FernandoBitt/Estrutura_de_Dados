package controller;

import javax.swing.JOptionPane;


public class Lista {
	private Curso dados[];
	private int tamanho;
	
	
	public Lista (int n) {
		dados=new Curso[n];
		tamanho=0;
	}
	
	public void addFinal (Curso c) {
		if (tamanho < dados.length) {
			dados[tamanho]=c;
			tamanho++;
		}else {
			JOptionPane.showMessageDialog(null, "Cheia");
		}	
	}
	
	public void addInicio(Curso c) {
		if (tamanho<dados.length){           
			for (int i=tamanho;i>0;i--){         
				dados[i]=dados[i-1];                 
			}
			dados[0]=c;                          
			tamanho++;                           
		}
		else{
			System.out.println("Erro, lista cheia");        
		}
	}
	
	public void addQualquer(Curso c, int pos) {
		int i;
		pos=pos-1;
		if ((tamanho<dados.length)&&(pos<tamanho+1)&&(pos>=0)){


			for (i=tamanho;i!=pos;i--){                     
				if (i!=0){                                      
					dados[i]=dados[i-1];                            
				}
			}
			dados[i]=c;                                     
			tamanho++;                                      
		}
	}
	
	
	public Curso romoveFinal() {
		Curso c = null;
		if (tamanho>0) {
			c=dados[tamanho-1];
			tamanho--;
		}else {
			JOptionPane.showMessageDialog(null, "Vazia");
			return null;
		}
		
		Curso mostra = c;
		return mostra;
	}
	
	public Curso removeInicio() {
		Curso c = null;
		int i;
		if (tamanho>=1){                              
			c=dados[0];
			for (i=1;i<tamanho;i++){                      
				dados[i-1]=dados[i];                          
			}
			tamanho--;                                   
		}
		return c;
	}
	
	public Curso removeQualquer(int pos) {
		int i;
		Curso c = null;

		if ((pos<tamanho)&&(pos>=0)&&(tamanho>=1)){
			c=dados[pos-1];

			for (i=pos;i<tamanho-1;i++){                 
				dados[i]=dados[i+1];                         
			}

			tamanho--;                                   
		}
		return c;
	
	}
	
	public String exibe() {
		String mostra = "";

		for(int i=0; i<tamanho;i++) {
			mostra += dados[i] + "\n";
		}
	return mostra;
	}
	
	public  Curso cadastra() {
		Curso curso = new Curso();
		curso.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do curso")));
		curso.setNome(JOptionPane.showInputDialog("Digite o nome do curso"));
		curso.setAreaCurso(JOptionPane.showInputDialog("Digite a área do curso"));
		curso.setQuantidadeSemestre(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres")));
		curso.setPeriodo(JOptionPane.showInputDialog("Digite o período"));
		return curso;
	}
	
}
