package com.cos.shop.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
	private int id;
	private int subCount;
	private int subPrice;
	private int userId;
	private int productId;
	private int paymentId;
	private Timestamp createDate;
}
