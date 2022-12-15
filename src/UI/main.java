package UI;

import Application.AggService;
import Domain.ValueObject.Etudiant;
import Domain.ValueObject.Salle;

public class main {

	public static void main(String[] args) {
		
		AggService ag = new AggService();
		
		int id = ag.CreateBat();
		
		Etudiant etud1 = new Etudiant("HAMID", 20,"CSI");
		
		Salle salle1 = new Salle(20, 10);
		
		ag.AjoutSallle(id, salle1);
		ag.reserver(id, etud1, 5);
		ag.liberer(id, salle1);
		
	}

}
