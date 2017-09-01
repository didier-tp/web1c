package com.sopra.resa.service;

import java.util.Date;
import java.util.List;

import com.sopra.resa.model.Localite;
import com.sopra.resa.model.Vol;

public interface ServiceVols {
	List<Localite> rechercherListeLocalite();
	List<Vol> rechercherVolsDeparts(String ville, Date date);
}
