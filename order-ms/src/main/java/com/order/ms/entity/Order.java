package com.order.ms.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ORDER_TB")
public class Order {

	@Id
	@GeneratedValue
	private long id;

	@Column
	private String item;

	@Column
	private int quantity;

	@Column
	private double amount;

	@Column
	private String status;

}
