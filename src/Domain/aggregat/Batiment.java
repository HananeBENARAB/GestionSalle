package Domain.aggregat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Domain.ValueObject.Etudiant;
import Domain.ValueObject.Salle;

public class Batiment {
	private static int cpt=1;
	private final int id;
	private HashMap<Integer,Salle>MapSalle;
	private HashMap<Etudiant,Salle>MapReservation;
	
	
	
	
	public Batiment() {
		super();
		this.id = cpt;
		MapSalle=new HashMap<>();
		MapReservation=new HashMap<>();
	}


	public int getId() {
		return id;
	}




	
	public void AjoutSalle(Salle salle) {
		MapSalle.put(salle.getId(), salle);
	}
	
	public void LibererSalle(Salle salle) {
		MapSalle.remove(salle);
	}
	
	public boolean ReserverUneSalle(Etudiant etud, int nbPers) {
		
		for (Entry<Integer, Salle> mp : this.MapSalle.entrySet()) {
			Salle s = (Salle) mp.getValue();
			if(!MapReservation.containsValue(s)&& !MapSalle.isEmpty()) {
				MapReservation.put(etud, s);
				System.out.println(etud.toString() +" a reserver : salle "+s.getId() + "Etage : "+s.getEtage());
				return true;
		}
			else {System.out.println("aucune salle dispo");}
		}
		return false ;
	}

}
