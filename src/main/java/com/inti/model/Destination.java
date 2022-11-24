package com.inti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
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
	private long id;
	private long longitude;
	private long latitude;
//hjezcfyvzeycvsdyvcdsvyc
}
