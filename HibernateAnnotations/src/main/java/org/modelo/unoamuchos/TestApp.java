package org.modelo.unoamuchos;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestApp {

	public static void main(String[] args) {
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Departamento.class);
			cfg.addAnnotatedClass(Personal.class);
			new SchemaExport(cfg).create(true, true);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
	
}



