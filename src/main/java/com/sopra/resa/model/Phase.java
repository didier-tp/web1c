package com.sopra.resa.model;

import java.util.Date;

public class Phase {
	
	private Localite localite;
	private Date date;
	
	public Localite getLocalite() {
		return localite;
	}
	public void setLocalite(Localite localite) {
		this.localite = localite;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Phase(Localite localite, Date date) {
		super();
		this.localite = localite;
		this.date = date;
	}
	public Phase() {
		super();
	}
	
	
}
