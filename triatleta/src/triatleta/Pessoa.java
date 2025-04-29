package triatleta;

public abstract class Pessoa {
	
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void visualizar() {
		System.out.println("\n*********************************\n"
						 + "Dados do Atleta\n"
						 + "*********************************\n"
						 + "Nome do atleta: " + this.nome + "\n");
	}
}
