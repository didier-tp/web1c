package com.sopra.resa.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sopra.resa.model.Localite;
import com.sopra.resa.model.Vol;

@Service
public class ServiceVolsImpl implements ServiceVols {

	@Override
	public List<Localite> rechercherListeLocalite() {
		List<Localite> listeLoc = new ArrayList<Localite>();
		listeLoc.add(new Localite(1L,"Paris", "Orly"));
		listeLoc.add(new Localite(2L,"Paris", "Roissy"));
		listeLoc.add(new Localite(3L,"Toulouse", "Toulouse"));
		listeLoc.add(new Localite(4L,"Nice", "Nice"));
		return listeLoc;
	}

	@Override
	public List<Vol> rechercherVolsDeparts(String ville, Date date) {
		List<Vol> listeVols= new ArrayList<Vol>();
		switch(ville) {
		case "Paris":
			listeVols.add(new Vol(1L, 12.0, null, null));
			listeVols.add(new Vol(2L, 120.0, null, null));
			listeVols.add(new Vol(3L, 12.5, null, null));
			break;
		case "Toulouse":
			listeVols.add(new Vol(10L, 212.0, null, null));
			listeVols.add(new Vol(11L, 2120.0, null, null));
			listeVols.add(new Vol(12L, 212.5, null, null));
			break;
		case "Nice":
			listeVols.add(new Vol(19L, 312.0, null, null));
			listeVols.add(new Vol(111L, 3120.0, null, null));
			listeVols.add(new Vol(121L, 312.5, null, null));
			break;
		}
		
		return listeVols;
	}

}
