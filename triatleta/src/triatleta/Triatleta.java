package triatleta;

public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista {

	public Triatleta(String nome) {
		super(nome);
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo 🙆🏻‍♀️‍");
		
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando 🚴🏻‍♀️");
		
	}

	@Override
	public void correr() {
		System.out.println("Correndo 🏃🏻‍♀️‍➡️");
		
	}

	@Override
	public void nadar() {
		System.out.println("Nadando 🚴🏻‍♀️");
		
	}

	

}
