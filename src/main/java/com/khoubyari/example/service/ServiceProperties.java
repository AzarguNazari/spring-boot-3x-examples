package com.khoubyari.example.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/*
 * demonstrates how service-specific properties can be injected
 */
@ConfigurationProperties(prefix = "hotel.service", ignoreUnknownFields = false)
@Component
public class ServiceProperties {

	@NonNull
	private String name = "Empty";

	public String name() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
