package me.parkprin.borokafkaconsumer.dto;

import java.util.function.Function;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BusinessCommonSet {

	private String bizCd; // 사업자코드

	private Business biz;

	private Boolean upGroupExistYn;  // 상위 그룹 존재 여부


	private Boolean unRegItemPermissionYn; // 상품 검색 시, 미등록 상품 등록 허용 - DB: 미등록상품허용여부

	private Boolean salePreArrangementStockReflectionYn; // 매출예정 수량 주문재고 반영 - DB: 매출예정재고반영여부

	private Boolean stock0PermissionYn; // 현재고 0인 상품 주문 허용 - DB: 재고0허용여부

	private Boolean stockSearchPermissionYn; // 상품 재고 조회 허용 - DB: 재고조회허용여부

	private Integer downGroupClosingTm; // 하위그룹 상품별 주문마감 설정 - DB: 하위그룹마감시간 NOTE: 하위의 BIZ_ITEMORDER_CLOSING_GROUP의 CLOSING_DDAY/TM 으로 재귀적으로 내려보내주기

	private Boolean tradeSlipDisplayYn; // 매입/매출 회계전표 노출 설정


	private UnitPriceApply basicUnitPriceApplyCd; // 기본 단가적용법 코드 - DB: 기본단가적용코드

	private String basicTradeGradeCd; // 기본 적용(거래)등급 코드(식별자) - DB: 기본거래등급코드

	@Deprecated
	private Integer basicDeliveryDday; // 기본 거래일 - DB: 기본배송디데이 - 삭제대상. basicTradeDe으로 대체

	private Integer basicTradeDe; // 기본거래일

	private String basicTradeTm; // 기본거래시간


	private Boolean upStockSearchPermissionYn; // 상위 상품 재고 조회 허용 - DB: 재고조회허용여부

}
