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

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Destination {
	@Id
	private long idHotel;
	private long longitude;
	private long latitude;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "Hotel")
	private List<Hotel> listeHotel;

}
