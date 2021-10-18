package me.parkprin.borokafkaconsumer.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 숫자표기설정코드(NUM_DISPLAY_SET)
 */
@AllArgsConstructor
@Getter
public enum NumDisplaySet {
	/** 000. 버림 */
	T_000P("000. 버림", -3, RoundingMode.FLOOR),
	/** 00. 반올림 */
	R_00P("00. 반올림", -2, RoundingMode.HALF_UP),
	/** 00. 버림 */
	T_00P("00. 버림", -2, RoundingMode.FLOOR),

	/** 0. 올림 */
	C_0P("0. 올림", -1, RoundingMode.CEILING),
	/** 0. 반올림 */
	R_0P("0. 반올림", -1, RoundingMode.HALF_UP),
	/** 0. 버림 */
	T_0P("0. 버림", -1, RoundingMode.FLOOR),

	/** .0 올림 */
	C_P0(".0 올림", 0, RoundingMode.CEILING),
	/** .0 반올림(Default)  */
	R_P0(".0 반올림", 0, RoundingMode.HALF_UP),
	/** .0 버림 */
	T_P0(".0 버림", 0, RoundingMode.FLOOR),

	/** .00 올림 */
	C_P00(".00 올림", 1, RoundingMode.CEILING),
	/** .00 반올림  */
	R_P00(".00 반올림", 1, RoundingMode.HALF_UP),
	/** .00 버림  */
	T_P00(".00 버림", 1, RoundingMode.FLOOR),

	/** .000 올림 */
	C_P000(".000 올림", 2, RoundingMode.CEILING),
	/** .000 반올림 */
	R_P000(".000 반올림", 2, RoundingMode.HALF_UP),
	/** .000 버림 */
	T_P000(".000 버림", 2, RoundingMode.FLOOR),

	/** .0000 올림 */
	C_P0000(".0000 올림", 3, RoundingMode.CEILING),
	/** .0000 반올림 */
	R_P0000(".0000 반올림", 3, RoundingMode.HALF_UP),
	/** .0000 버림 */
	T_P0000(".0000 버림", 3, RoundingMode.FLOOR),


	AMOUNT_DEFAULT_POLICY(".0000 반올림", 3, RoundingMode.HALF_UP),
	QUANTITY_DEFAULT_POLICY(".0000 반올림", 3, RoundingMode.HALF_UP),

	NONE("미적용", 10, RoundingMode.HALF_UP);

	public static final String SECTION_CD = "NUM_DISPLAY_SET";
	private final String codeName;
	private final int scale; // decimal
	private final RoundingMode roundingMode;

	public static NumDisplaySet ofNullable(String code) {
		for (NumDisplaySet value : values()) {
			if (value.name().equals(code)) {
				return value;
			}
		}
		return null;
	}

	public BigDecimal setScale(BigDecimal bigDecimal) {
		if (Objects.isNull(bigDecimal)) {
			return null;
		}
		return bigDecimal.setScale(this.getScale(), this.getRoundingMode());
	}

}
