package Domain.Repository;

import Domain.aggregat.Batiment;

public interface IntRepository {
	
	Batiment FindById(int id);
	void save(Batiment bat);

}
