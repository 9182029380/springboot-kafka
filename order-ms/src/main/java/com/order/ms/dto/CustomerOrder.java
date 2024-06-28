package com.order.ms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrder {
	private String item;

	private int quantity;

	private double amount;

	private String paymentMode;

	private long orderId;

	private String address;

}
