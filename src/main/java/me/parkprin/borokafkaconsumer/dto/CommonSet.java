package me.parkprin.borokafkaconsumer.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommonSet {

	private GroupCommonSet groupCommonSet; // : GroupCommonSet

	private GroupCommonSet headOfficeGroupCommonSet;

	private List<BusinessCommonSet> businessCommonSets; // : [BizCommonSet]

	private BusinessCommonSet headOfficeBusinessCommonSet;
}
