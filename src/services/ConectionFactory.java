package services;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConectionFactory {
	
	
	private static final String PERSISTENCE_UNIT_NAME = "vendas2";
	private static EntityManagerFactory factoryInstance;
	
	public static EntityManagerFactory getConnection() {
		if(factoryInstance == null) {
			factoryInstance = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factoryInstance;
	}
}
