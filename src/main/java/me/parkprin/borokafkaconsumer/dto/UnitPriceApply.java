package me.parkprin.borokafkaconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 단가적용코드(UNIT_PRICE_APPLY)
 */
@AllArgsConstructor
@Getter
public enum UnitPriceApply {
	UNPR0010("거래처별특단가"),
	UNPR0020("등급단가");

	public static final String SECTION_CD = "UNIT_PRICE_APPLY";
	private final String codeName;

	public static UnitPriceApply ofNullable(String code) {
		for (UnitPriceApply value : values()) {
			if (value.name().equals(code)) {
				return value;
			}
		}
		return null;
	}

	/**
	 * 특단가 여부.
	 * @return
	 */
	public boolean isSpecialPriceByCust() {
		return this == UNPR0010;
	}

	/**
	 * 등급단가 여부.
	 * @return
	 */
	public boolean isGradePriceByCust() {
		return this == UNPR0020;
	}
}
