package com.ensa.gi4.service.impl;

import com.ensa.gi4.dao.MaterielDAO;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

public class GestionMaterielServiceImpl implements GestionMaterielService {
    
	public MaterielDAO materielDAO;
	
	
	
	
    public GestionMaterielServiceImpl(MaterielDAO materielDAO) {
		
    	this.materielDAO = materielDAO;
	}

	@Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {
       materielDAO.ListerMaterielDAO();
    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
        
    	materielDAO.AjouterMaterielDAO(materiel);
       
    }

	@Override
	public void supprimerMateriel(int id) {
		
		materielDAO.SupprimerMaterielDAO(id);
		
	}

	@Override
	public void modifierMateriel(int id, String name) {
		
		materielDAO.ModifierMaterielDAO(id, name);
		
	}

	@Override
	public Materiel rechercherMateriel(Materiel materiel) {
		
		return materielDAO.RechercheDAO(materiel);
	}
}
