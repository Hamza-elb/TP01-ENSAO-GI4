package com.ensa.gi4.dao;

import java.util.ArrayList;
import java.util.List;

import com.ensa.gi4.modele.Materiel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.tree.RowMapper;


@Repository
public class MaterielDAOImpl extends GenericDAO<Materiel> implements MaterielDAO {
	@Autowired
	public ListesDesMateriels listesDesMateriels;

	 private MaterielDAOImpl materiel_dao_impl = null;

    public MaterielDAOImpl(ListesDesMateriels listesDesMateriels) {

    	this.listesDesMateriels = listesDesMateriels;
    }
	public MaterielDAOImpl( ) {
	}

	@Override
	public List<Materiel> findAll() {
		return super.findAll("SELECT * FROM MATERIEL;");
	}

	@Override
	public Materiel findOne(Long id) {
		return super.findOne("SELECT * FROM MATERIEL WHERE ID=?;", id);
	}

	@Override
	public void ListerMaterielDAO() {
		
		ArrayList<Materiel> l = listesDesMateriels.getL();
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).getName());
        }
		
	}

	@Override
	public void RechercheDAO(String name) {

		boolean resultat = false;
		for (int i = 0; i < listesDesMateriels.getL().size(); i++) {
			if(listesDesMateriels.getL().get(i).getName().equals(name)){
				resultat = true;
			}

		}
		if(resultat){
			System.out.println(name+" est sur la liste");
		}
		else{
			System.out.println(name+" n'existe pas");
		}
	}

	@Override
	public void AjouterMaterielDAO(Materiel materiel) {
		
		listesDesMateriels.L.add(materiel);
		
	}

	@Override
	public void SupprimerMaterielDAO(int id) {
	
		for (int i = 0; i < listesDesMateriels.getL().size(); i++) {
            if ( listesDesMateriels.getL().get(i).getId() == id) {
            	 listesDesMateriels.getL().remove(i);
            }
        }
		
	}

	@Override
	public void ModifierMaterielDAO(int id, String name) {
		
		 for (int i = 0; i <listesDesMateriels.getL().size(); i++) {
	            if (listesDesMateriels.getL().get(i).getId() == id) {
	            	listesDesMateriels.getL().get(i).setName(name);
	            }
	        }
	    }


	@Override
	protected RowMapper getRowMapper() {
		return null;
	}
}
