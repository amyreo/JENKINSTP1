package com.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voyageur {
	@Id
	private int idVoyageur;
	private String nom;
	private String prenom;
	private int age;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "voyageur")
	private List<Reservation> listeReservations;
}
