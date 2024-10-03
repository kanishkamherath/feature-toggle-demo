package com.kanishka.toggle.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;

import com.kanishka.toggle.dto.FeatureInfo;
import com.kanishka.toggle.service.FeatureService;

@Service
public class FeatureServiceImpl implements FeatureService {

	@Autowired
	private FeatureManager featureManager;

	@Override
	public List<FeatureInfo> getAllFeatures() {
		List<FeatureInfo> featureList = new ArrayList<>();

		for (Feature feature : featureManager.getFeatures()) {
			featureList.add(new FeatureInfo(feature.name(), feature.isActive()));
		}
		return featureList;
	}
}
