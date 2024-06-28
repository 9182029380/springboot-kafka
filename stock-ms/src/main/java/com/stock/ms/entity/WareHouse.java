package com.stock.ms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "WAREHOUSE")
public class WareHouse {

	@Id
	@GeneratedValue
	private long id;

	@Column
	private int quantity;

	@Column
	private String item;

}
