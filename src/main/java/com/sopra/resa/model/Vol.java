package com.sopra.resa.model;

public class Vol {
	private Long num;
	private Double prix;
	private Phase depart;
	private Phase arrivee;
	
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Phase getDepart() {
		return depart;
	}
	public void setDepart(Phase depart) {
		this.depart = depart;
	}
	public Phase getArrivee() {
		return arrivee;
	}
	public void setArrivee(Phase arrivee) {
		this.arrivee = arrivee;
	}
	public Vol(Long num, Double prix, Phase depart, Phase arrivee) {
		super();
		this.num = num;
		this.prix = prix;
		this.depart = depart;
		this.arrivee = arrivee;
	}
	public Vol() {
		super();
	}
	
}
