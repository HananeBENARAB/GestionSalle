package Domain.ValueObject;

import java.util.Objects;

public class Salle {
	private static int cpt=1;
	private final int id;
	private final int capacite;
	private final int etage;
	
	
	public Salle(int capacite, int etage) {
		super();
		id=cpt;
		this.capacite = capacite;
		this.etage = etage;
		cpt++;
	}


	public int getId() {
		return id;
	}


	public int getCapacite() {
		return capacite;
	}


	public int getEtage() {
		return etage;
	}


	@Override
	public int hashCode() {
		return Objects.hash(capacite, etage, id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salle other = (Salle) obj;
		return capacite == other.capacite && etage == other.etage && id == other.id;
	}


	@Override
	public String toString() {
		return "Salle [id=" + id + ", capacite=" + capacite + ", etage= " + etage + "]";
	}
	
	
	
	
	
	

}
