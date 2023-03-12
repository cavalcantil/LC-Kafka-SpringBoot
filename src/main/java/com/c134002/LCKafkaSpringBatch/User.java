package com.c134002.LCKafkaSpringBatch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class User {
	private int Id;
	private String Name;
	private String[] Address;

}
