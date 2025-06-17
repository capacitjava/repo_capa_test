package org.ejemplo.unoauno;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestApp {

	public static void main(String[] args) {
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Supervisor.class);
			cfg.addAnnotatedClass(SupervisorDetalle.class);
			new SchemaExport(cfg).create(true, true);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}

}
