package com.tcs.HibernateProject.databaseConfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sf;

	public static SessionFactory getSf() {
		return sf;
	}

	static {
		try {			
			Configuration obj = new Configuration().configure();
			sf = obj.buildSessionFactory();
		} catch (Exception e) {
			System.out.print("Error while creating session factory" + e.getMessage());
		}
	}
	
}
