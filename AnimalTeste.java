package exerciciosjava08;

public class AnimalTeste {

	public static void main(String[] args) {

		Animal cachorro = new Animal();
		Animal cavalo = new Animal();
		Animal preguica = new Animal();

		cachorro.setNome("Bradoock.");
		cachorro.setIdade("4 anos!");
		cachorro.setSom("sim, o latido!");
		cachorro.setCorrer(" Sim!");

		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("Qual idade? " + cachorro.getIdade());
		System.out.println("Emite som? " + cachorro.getSom());
		System.out.println("Este animal corre?" + cachorro.getCorrer());

		cavalo.setNome("Chico Corda.");
		cavalo.setIdade("9 anos!");
		cavalo.setSom("Sim, ele relincha!");
		cavalo.setCorrer(" Sim!");
		System.out.println("========================");

		System.out.println("Nome do cavalo: " + cavalo.getNome());
		System.out.println("Qual idade? " + cavalo.getIdade());
		System.out.println("Emite som? " + cavalo.getSom());
		System.out.println("Este animal corre?" + cavalo.getCorrer());

		preguica.setNome("Joaninha.");
		preguica.setIdade("18 anos!");
		preguica.setSom("Não!");
		preguica.setCorrer(" Não!");
		
		System.out.println("========================");

		System.out.println("Nome da preguica: " + preguica.getNome());
		System.out.println("Qual idade? " + preguica.getIdade());
		System.out.println("Emite som? " + preguica.getSom());
		System.out.println("Este animal corre?" + preguica.getCorrer());

	}
}


