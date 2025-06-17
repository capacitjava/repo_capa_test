package org.ejemplo.unoauno;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class SupervisorDetalle {
	
	private int id;
	private String rfc;
	private String curp;
	private int nss;
	private Supervisor id_supervisor_fk;
	
	@Id
	@Column(nullable = false)
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
	
	/*
	 * CUAL ES LA DIFERENCIA ENTRE EAGER Y LAZY?
	 * EAGER(ANSIOSO): CARGA TODAS LAS TABLAS ASOCIADAS. 
	 * LAZY(PEREZOSO): CARGA, TABLA POR TABLA.
	 * 
	 * PERSIST: INSERT
	 * MERGE: UPDATE
	 * REFRESH: VIEW
	 * REMOVE: DELETE
	 * 
	 */
	
	@OneToOne(cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER )
	@JoinTable(name = "id_supervisor_fk")
	public Supervisor getId_supervisor_fk() {
		return id_supervisor_fk;
	}
	public void setId_supervisor_fk(Supervisor id_supervisor_fk) {
		this.id_supervisor_fk = id_supervisor_fk;
	}
	
	

}
