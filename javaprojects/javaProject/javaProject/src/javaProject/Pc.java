package javaProject;

import java.util.Objects;

public class Pc extends Appareil {

	private String modele,description;

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pc(String id, String type, double prix, String modele, String description) {
		super(id, type, prix);
		this.modele = modele;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Pc [modele=" + modele + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(description, modele);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pc other = (Pc) obj;
		return Objects.equals(description, other.description) && Objects.equals(modele, other.modele);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return new Pc(getId(), getType(), getPrix(), modele, description);
	}
	
}
