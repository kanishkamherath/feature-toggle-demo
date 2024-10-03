package com.kanishka.toggle.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

import com.kanishka.toggle.dto.PromotionInfo;
import com.kanishka.toggle.dto.Product;
import com.kanishka.toggle.enums.Features;
import com.kanishka.toggle.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private FeatureManager featureManager;

	@Override
	public List<Product> getAllProducts() {
		boolean isPromotionEnabled = featureManager
				.isActive(new NamedFeature(Features.IS_PROMOTION_ENABLED.toString()));

		return List.of(new Product(1, "Google Pixel 9 Pro", 1000.0, isPromotionEnabled ? getPromotionInfo() : null),
				new Product(2, "Apple iPhone 16", 1200.0, isPromotionEnabled ? getPromotionInfo() : null),
				new Product(3, "Samsung Galaxy S22", 1100.0, isPromotionEnabled ? getPromotionInfo() : null),
				new Product(4, "Google Pixel 8", 800.0, isPromotionEnabled ? getPromotionInfo() : null),
				new Product(5, "Nothing Phone 2", 900.0, isPromotionEnabled ? getPromotionInfo() : null));
	}

	private PromotionInfo getPromotionInfo() {
		return new PromotionInfo(25.0, "Christmas Sale!", LocalDateTime.now().plusDays(10));
	}

}
