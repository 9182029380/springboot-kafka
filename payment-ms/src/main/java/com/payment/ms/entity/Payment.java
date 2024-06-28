package com.payment.ms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "payment")
public class Payment {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String mode;

	@Column
	private Long orderId;

	@Column
	private double amount;

	@Column
	private String status;

}
