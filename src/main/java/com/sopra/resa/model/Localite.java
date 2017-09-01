package com.sopra.resa.model;

//@Entity etc...
public class Localite {
	private Long id;
	private String ville;
	private String aeroport;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAeroport() {
		return aeroport;
	}
	public void setAeroport(String aeroport) {
		this.aeroport = aeroport;
	}
	public Localite(Long id, String ville, String aeroport) {
		super();
		this.id = id;
		this.ville = ville;
		this.aeroport = aeroport;
	}
	public Localite() {
		super();
	}
	
}
