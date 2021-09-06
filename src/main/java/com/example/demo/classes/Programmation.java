package com.example.demo.classes;

public class Programmation extends Langage {

private boolean compilation;
private String type;
private String complexite;
public boolean isCompilation() {
	return compilation;
}
public void setCompilation(boolean compilation) {
	this.compilation = compilation;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getComplexite() {
	return complexite;
}
public void setComplexite(String complexite) {
	this.complexite = complexite;
}
@Override
public String toString() {
	return "Programmation [compilation=" + compilation + ", type=" + type + ", complexite=" + complexite + "]";
}









}
