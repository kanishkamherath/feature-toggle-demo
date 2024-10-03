package com.kanishka.toggle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FeatureInfo {

	private String feature;
	private Boolean enabled;

}
