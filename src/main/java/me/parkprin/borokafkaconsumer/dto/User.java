package me.parkprin.borokafkaconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	private String userId; // 아이디

	private String userNm; // 사용자이름

	private Long userNo; // 사용자식별값
}
