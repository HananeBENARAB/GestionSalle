package Application;

import Domain.Repository.IntRepository;
import Domain.ValueObject.Etudiant;
import Domain.ValueObject.Salle;
import Domain.aggregat.Batiment;
import Infrastructure.ImpRepository;

public class AggService {
	private final IntRepository rep;

	public AggService() {
		super();
		this.rep = new ImpRepository();
	}
	
	public int CreateBat()
	{	Batiment bat = new Batiment();
		this.rep.save(bat);
		return bat.getId();
	}
	
	public  void AjoutSallle(int id ,Salle salle) {
		Batiment bat=this.rep.FindById(id);
		bat.AjoutSalle(salle);
		this.rep.save(bat);
	}
	
	public  void liberer(int id ,Salle salle) {
		Batiment bat=this.rep.FindById(id);
		bat.LibererSalle(salle);
		System.out.println("Salle "+salle.getId()+" a été libérée ");
		this.rep.save(bat);
	}
	
	public void reserver(int id, Etudiant etud, int nbPersonne) {
		Batiment bat=this.rep.FindById(id);
		bat.ReserverUneSalle(etud,nbPersonne );
		
		this.rep.save(bat);
	}
}
