package com.ensa.gi4.service.impl;

import com.ensa.gi4.dao.MaterielDAO;
import com.ensa.gi4.dao.MaterielDAOImpl;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GestionMaterielServiceImpl implements GestionMaterielService {

	@Autowired
	public MaterielDAOImpl materielDAO;


    public GestionMaterielServiceImpl(MaterielDAOImpl materielDAO) {

    	this.materielDAO = materielDAO;
	}

	public GestionMaterielServiceImpl() {


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
	public void rechercherMateriel(String name) {

		materielDAO.RechercheDAO(name);
	}
}
