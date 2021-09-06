package com.example.demo.classes;

public class Manipulation extends Langage {
private int version;
private boolean isbigdata;
public Manipulation() {
}
public Manipulation(int id, String titre, String domaine, int version, boolean isbigdata) {
	super(id, titre, domaine);
	this.version = version;
	this.isbigdata = isbigdata;
}
@Override
public String toString() {
	return "Manipulation [version=" + version + ", isbigdata=" + isbigdata + ", toString()=" + super.toString() + "]";
}






}
