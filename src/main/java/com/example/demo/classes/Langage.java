package com.example.demo.classes;

public class Langage {
private int id;
private String titre;
private String domaine;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDomaine() {
	return domaine;
}
public void setDomaine(String domaine) {
	this.domaine = domaine;
}
@Override
public String toString() {
	return "Langage [id=" + id + ", titre=" + titre + ", domaine=" + domaine + "]";
}
public Langage(int id, String titre, String domaine) {
	this.id = id;
	this.titre = titre;
	this.domaine = domaine;
}
public Langage() {
}




}
