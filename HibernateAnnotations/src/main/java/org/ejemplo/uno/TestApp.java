package org.ejemplo.uno;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestApp {
	
	public static void main(String[] args) {
		try {
			//IMPORTA LA CONFIGURACIÓN DE HIBERNATE.
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			//SITUA EL ARCHIVO DE CONFIGURACIÓN.
			cfg.configure("hibernate.cfg.xml");
			//INVOCAMOS LA O LAS ANOTACIONES
			cfg.addAnnotatedClass(Bitacora.class);
			//CREAMOS LAS CONSULTAS Y SCHEMAS EN ORACLE
			new SchemaExport(cfg).create(true, true);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
	}
}



