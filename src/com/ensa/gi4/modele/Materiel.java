package com.ensa.gi4.modele;

public abstract class Materiel {
	
	protected int id;
    protected String name;
    

    public Materiel() {

    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Materiel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
