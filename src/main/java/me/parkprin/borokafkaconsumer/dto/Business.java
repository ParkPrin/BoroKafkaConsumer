package me.parkprin.borokafkaconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Business {
	private String id; // 사업자 식별자

	private String name; // 사업자명
}
