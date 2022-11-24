package com.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

	@Id
	private int idHotel;
	private String nomHotel;
	private int nbEtoile;
	
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "idDestination")
	private Destination destination;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "hotel")
	private List<Avis> listeAvis;
	
}
