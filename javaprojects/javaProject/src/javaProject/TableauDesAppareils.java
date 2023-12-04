package javaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TableauDesAppareils {

	private Appareil[] Appareils= new Appareil[6];

	public void TableauAppareil() {
		Appareils[0]=new Appareil("123ab", "Tv", 6000);
		Appareils[1]=new Appareil("123ac", "Pc", 4000);
		Appareils[2]=new Appareil("123ap", "Phone", 2000);

	}
	public void trierTabAppareil(Comparator<Appareil> cmp) {
		Arrays.sort(Appareils,cmp);
	}
	

	public boolean tester(Appareil vh) {
		for(Appareil v:Appareils) {
			if(v.equals(vh)) 
				return true;
		}
		return false;
	}

	
	public boolean AjouterAppareil(Appareil v) {
		ArrayList<Appareil> list= new ArrayList<Appareil>(Arrays.asList(Appareils));
		if(this.tester(v))
			return false;
		list.add(v);
		Appareils = list.toArray(new Appareil[list.size()]);
		return true;
	}
	
	
	public boolean SupprimerAppareil(Appareil v) {
		if(!this.tester(v)) {
			return false;
		}
		ArrayList<Appareil> list = new ArrayList<Appareil>(Arrays.asList(Appareils));
		list.remove(v);
		Appareils= list.toArray(new Appareil[list.size()]);
		return true;
	}
	public int nbElement() {
		return Appareils.length;
	}
	public void inverserTableau() {
		ArrayList<Appareil> list = new ArrayList<Appareil>(Arrays.asList(Appareils));
		Collections.reverse(list);
		Appareils= list.toArray(new Appareil[list.size()]);	
	}
	
	public void afficher() {
		for(Appareil a:Appareils) {
			System.out.println(a);
		}
	}
	

	public boolean eqTab(Appareil[] a1,Appareil[] a2) {
		return Arrays.equals(a1, a2);
	}


	
}
