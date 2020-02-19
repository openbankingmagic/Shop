package com.cos.shop.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	private int id;
	private int totalCount;
	private int totalprice;
	private int userId;
	private Timestamp createDate;
}
