package com.cos.shop.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nice {
	private int id;
	private int userId;
	private int producId;
	private Timestamp createDate;

}
