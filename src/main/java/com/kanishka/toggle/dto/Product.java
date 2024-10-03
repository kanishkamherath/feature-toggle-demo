package com.kanishka.toggle.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

	private Integer id;
	private String name;
	private Double price;
	private PromotionInfo promotionInfo;

}
