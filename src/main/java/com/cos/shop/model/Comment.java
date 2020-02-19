package com.cos.shop.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
	private int id;
	private String title;
	private String content;
	private int boardId;
	private int userId;
	private int productId;
	private Timestamp createDate;
}
