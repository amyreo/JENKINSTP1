package com.inti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

	@Id
	private int idVoyageur;
	private String dateReservation;
	private int nbJours;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idVoyageur")
	private Voyageur voyageur;
}
