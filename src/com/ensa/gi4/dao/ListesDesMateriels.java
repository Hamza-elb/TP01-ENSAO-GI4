package com.ensa.gi4.dao;

import java.util.ArrayList;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;

public class ListesDesMateriels {
	
	public ArrayList<Materiel> L = new ArrayList<Materiel>();

	public ListesDesMateriels() {
		
		L.add(new Livre(1,"LIVRE 1"));
		L.add(new Livre(2,"LIVRE 2"));
		
		
		L.add(new Chaise(1, "CHAISE 1"));
		L.add(new Chaise(1, "CHAISE 2"));
	}

	public ArrayList<Materiel> getL() {
		return L;
	}

	public void setL(ArrayList<Materiel> l) {
		L = l;
	}
	
	

}
