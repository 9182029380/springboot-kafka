package com.delivery.ms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "delivery")
public class Delivery {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String address;

	@Column
	private String status;

	@Column
	private long orderId;

}
