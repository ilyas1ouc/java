package javaProject;

import java.util.Objects;

public class Appareil implements Comparable <Appareil> {

	
	
	private String id;
	private String type;
	private double prix;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Appareil(String id, String type, double prix) {
		super();
		this.id = id;
		this.type = type;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Appareil [id=" + id + ", type=" + type + ", prix=" + prix + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, prix, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appareil other = (Appareil) obj;
		return Objects.equals(id, other.id) && Double.doubleToLongBits(prix) == Double.doubleToLongBits(other.prix)
				&& Objects.equals(type, other.type);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Appareil(id, type, prix);
	}

	@Override
	public int compareTo(Appareil a) {
		return this.id.compareTo(a.id);
	}
	
	
	
	



}
