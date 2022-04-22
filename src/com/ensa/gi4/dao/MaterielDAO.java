package com.ensa.gi4.dao;

import com.ensa.gi4.modele.Materiel;

public interface MaterielDAO {
	
	
	void ListerMaterielDAO();
	
    void RechercheDAO(String name);
    
    void AjouterMaterielDAO(Materiel materiel);
    
    void SupprimerMaterielDAO(int id);
    
    void ModifierMaterielDAO(int id, String name);

}
