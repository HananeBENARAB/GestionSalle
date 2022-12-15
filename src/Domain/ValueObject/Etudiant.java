package Domain.ValueObject;

import java.util.Objects;

public class Etudiant {
	private static int cpt=202200;
	private final String name;
	private final int numEtudiant;
	private final int age ;
	private final String NiveauEtude;
	
	public Etudiant(String name, int age, String niveauEtude) {
		super();
		numEtudiant=cpt;
		this.name = name;
		this.age = age;
		NiveauEtude = niveauEtude;
		cpt++;
	}

	public String getName() {
		return name;
	}

	public int getNumEtudiant() {
		return numEtudiant;
	}

	public int getAge() {
		return age;
	}

	public String getNiveauEtude() {
		return NiveauEtude;
	}

	@Override
	public int hashCode() {
		return Objects.hash(NiveauEtude, age, name, numEtudiant);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		return Objects.equals(NiveauEtude, other.NiveauEtude) && age == other.age && Objects.equals(name, other.name)
				&& numEtudiant == other.numEtudiant;
	}

	@Override
	public String toString() {
		return "Etudiant [name=" + name + ", numEtudiant=" + numEtudiant + ", age=" + age + ", NiveauEtude="
				+ NiveauEtude + "]";
	}
	
	
	
	
	
	
	
	

}
