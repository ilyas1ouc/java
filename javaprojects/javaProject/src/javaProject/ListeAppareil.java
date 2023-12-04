package javaProject;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class ListeAppareil {
	
	ArrayList<Appareil> list = new ArrayList<Appareil>();

	public void ListAppareil() {
		list.add(new Appareil("123ab", "Tv", 2021));
		list.add(new Appareil("123ac", "Phone", 2022));
		list.add(new Appareil("132ad", "Pc", 2015));
		}
	
	public void afficher() {
		for(Appareil a:list) {
			System.out.println(a);
		}
	}
	public void parcourIt() {
		Iterator<Appareil> it =list.iterator();
	    while (it.hasNext()) {
	        System.out.println(it.next());
	      }
	}
	public void ajouterAppareil(Appareil vh) {
		list.add(0,vh);
	}
	public Appareil recuperAppareil(int index) {
		if(index>=0 && index <list.size())
			return list.get(index);
		 throw new IllegalArgumentException("l indice  doit etre compris entre 0 et la taille");
	}
	public boolean supprimerAppareil(Appareil ap) {
		return list.remove(ap);
	}
	public boolean rechercheAppareil(Appareil ap) {
		return list.contains(ap);
	}
	public void trierAppareils(Comparator<Appareil> cmp) { 
		Collections.sort(list,cmp);
	}
	public ArrayList<Appareil> copierList() {
		ArrayList<Appareil> newlist = new ArrayList<Appareil>();
		newlist.addAll(list);
		return newlist;
		//return new ArrayList<Appareil>(list);
	}
	public void melangerList() {
		Collections.shuffle(list);
	}
	public void inverserList() {
		Collections.reverse(list);
	}	
	public ArrayList<Appareil> subList(int start, int end){
		if(start >=0 && end<list.size() && start<end) {
			return new ArrayList<Appareil>(list.subList(start, end));
		}
		throw new IllegalArgumentException("un probleme dans start ou end");
	}
	public boolean compareList(ArrayList<Appareil> list) {
		return list.equals(list);
	}
	public void echangerList(int v1,int v2) {
		Collections.swap(list, v1, v2);
	}
	public void viderList() {
		list.clear();
	}
	public boolean listEstVide() {
		return list.isEmpty();
	}
}
