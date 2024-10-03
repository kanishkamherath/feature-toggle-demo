package com.kanishka.toggle.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PromotionInfo {

	private Double discountPercentage;
	private String description;
	private LocalDateTime validTill;

}
