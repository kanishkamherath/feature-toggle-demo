package com.kanishka.toggle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kanishka.toggle.dto.FeatureInfo;
import com.kanishka.toggle.service.FeatureService;

@Controller
@RequestMapping("feature")
public class FeatureController {

	@Autowired
	private FeatureService featureService;

	@GetMapping("/all")
	public ResponseEntity<List<FeatureInfo>> getAllFeatures() {
		return ResponseEntity.ok(featureService.getAllFeatures());
	}

}
