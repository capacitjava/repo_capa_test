package org.ejemplo.muchosamuchos;

import java.util.zip.CRC32;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestApp {
	
	public static void main(String[] args) {
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Encargado.class);
			cfg.addAnnotatedClass(Evento.class);
			new SchemaExport(cfg).create(true, true);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}

}
