package com.devsuperior.dsdeliver.controllers.exceptions;

import lombok.Getter;

@Getter
public enum ProblemType {
	RESOURCE_NOT_FOUND("/resource-not-found","Resource not found"),
	BUSINESS_ERROR("/business-error", "Business rule violation"),
	INCOMPREHENSIBLE_MESSAGE("/incromprehensible-message","Incomprehensible message"),
	INVALID_DATA("/invalid-data","Invalid data"),
	INVALID_PARAMETER("/Invalid-parameter","Invalid parameter"),
	SYSTEM_ERROR("/system-error","System error");
	
	private String uri;
	private String title;
	
	private ProblemType(String uri,String title) {
		this.uri = uri;
		this.title = title;
	}
}
