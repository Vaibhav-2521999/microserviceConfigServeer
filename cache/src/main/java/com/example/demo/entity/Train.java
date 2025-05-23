package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Train 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String tname;
private int aseats;
private int tseats;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public int getAseats() {
	return aseats;
}
public void setAseats(int aseats) {
	this.aseats = aseats;
}
public int getTseats() {
	return tseats;
}
public void setTseats(int tseats) {
	this.tseats = tseats;
}
public Train(int id, String tname, int aseats, int tseats) {
	super();
	this.id = id;
	this.tname = tname;
	this.aseats = aseats;
	this.tseats = tseats;
}
@Override
public String toString() {
	return "Train [id=" + id + ", tname=" + tname + ", aseats=" + aseats + ", tseats=" + tseats + "]";
}
public Train() {
	super();
	// TODO Auto-generated constructor stub
}


}
