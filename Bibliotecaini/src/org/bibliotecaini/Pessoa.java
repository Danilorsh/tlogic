package org.bibliotecaini;

public class Pessoa {
	//Atributos
	private String nome; //nome da pessoa
	private int maxLivros; //numero max de livros para locar
	//Construtores
	public Pessoa () {
		nome = "Nome Desconhecido";
		maxLivros = 3;
			}
	public String getNome() {
		return nome;
			}
	public void setNome(String qualquerNome) {
		nome = qualquerNome;
		
			
	}
	public int getMaxLivros() {
		return maxLivros;
	}
	public void setMaxLivros(int maxLivros) {
		this.maxLivros = maxLivros;
		
		
	}
}
