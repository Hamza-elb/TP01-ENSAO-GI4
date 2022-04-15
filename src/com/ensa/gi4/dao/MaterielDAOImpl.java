package com.ensa.gi4.dao;

import java.util.ArrayList;

import com.ensa.gi4.modele.Materiel;

public class MaterielDAOImpl implements MaterielDAO {
	
	public ListesDesMateriels listesDesMateriels;

	@Override
	public void ListerMaterielDAO() {
		
		ArrayList<Materiel> l = listesDesMateriels.getL();
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).getName());
        }
		
	}

	@Override
	public Materiel RechercheDAO(Materiel materiel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AjouterMaterielDAO(Materiel materiel) {
		
		listesDesMateriels.L.add(materiel);
		
	}

	@Override
	public void SupprimerMaterielDAO(int id) {
	
		for (int i = 0; i < listesDesMateriels.L.size(); i++) {
            if ( listesDesMateriels.L.get(i).getId() == id) {
            	 listesDesMateriels.L.remove(i);
            }
        }
		
	}

	@Override
	public void ModifierMaterielDAO(int id, String name) {
		
		 for (int i = 0; i <listesDesMateriels.L.size(); i++) {
	            if (listesDesMateriels.L.get(i).getId() == id) {
	            	listesDesMateriels.L.get(i).setName(name);
	            }
	        }
	    }
		
	

}
