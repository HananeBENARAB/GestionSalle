package Infrastructure;

import java.util.HashMap;

import Domain.Repository.IntRepository;
import Domain.aggregat.Batiment;

public class ImpRepository implements IntRepository{
	HashMap<Integer,Batiment>Map ;
	
	public ImpRepository() {
		Map=new HashMap<>();
	}
	
	

	@Override
	public Batiment FindById(int id) {
		return Map.get(id);
	}

	@Override
	public void save(Batiment bat) {
		Map.put(bat.getId(), bat);
		
	}
	
	

}
