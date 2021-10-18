package me.parkprin.borokafkaconsumer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupCommonSet {

	private Integer itemCdSize; // 상품코드사이즈

	private Integer custCdSize; // 거래처코드사이즈

	private NumDisplaySet saleUnitPriceDisplayCd; // 매출단가표기코드

	private NumDisplaySet custUnitPriceDisplayCd; // 특단가표기코드

	private NumDisplaySet sumAmtDisplayCd; // 합계금액표기코드

	private NumDisplaySet vatAmtDisplayCd; // 부가세액표기코드

	private NumDisplaySet basicQtyApplyCd; // 기본수량적용코드


}
