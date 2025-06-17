package org.ejemplo.uno;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * EJEMPLO: CARDINALIDAD UNO
 * 
 * BITACORA
 * ID           NUMBER
 * TIPO         VARCHAR2
 * FECHA        DATE
 * VERSION      FLOAT
 * COMENTARIO   VARCHAR2
 * 
 */

@Entity //ENTIDAD
public class Bitacora {

	private int id;
	private String tipo;
	private Date fecha;
	private double version;
	private String comentario;
	
	@Id //PRIMARY KEY
	@Column(nullable = false) //NOT NULL
	@GeneratedValue //INCREMENT BY, SEQUENCE
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(nullable = false, columnDefinition = "VARCHAR2 (25)") //NOT NULL
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Column(nullable = false, columnDefinition = "FLOAT (10)") //NOT NULL
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
	
}









