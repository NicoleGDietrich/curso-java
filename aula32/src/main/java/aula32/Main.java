package aula32;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
	private static EntityManagerFactory factory; // criar e gerenciar conexões com o banco de dados

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}

	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}

}
	



	

