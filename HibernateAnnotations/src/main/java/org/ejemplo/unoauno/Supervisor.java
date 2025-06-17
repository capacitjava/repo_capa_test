package org.ejemplo.unoauno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * EJEMPLO: CARDINALIDAD, UNO A UNO
 * 
 * SUPERVISOR _________ SUPERVISORDETALLE
 * ID                   ID
 * NOMBRE               RFC
 * APEPAT               CURP
 *                      NSS
 *                      ID_SUPERVISOR_FK
 */

@Entity
public class Supervisor {
	
	private int id;
	private String nombre;
	private String apepat;
	
	@Id
	@Column(nullable = false)
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApepat() {
		return apepat;
	}
	public void setApepat(String apepat) {
		this.apepat = apepat;
	}
	
	

}


