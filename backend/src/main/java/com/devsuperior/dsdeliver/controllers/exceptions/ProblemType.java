package com.devsuperior.dsdeliver.controllers.exceptions;

import lombok.Getter;

@Getter
public enum ProblemType {
	RESOURCE_NOT_FOUND("/resource-not-found","Resource not found"),
	BUSINESS_ERROR("/business-error", "Business rule violation"),
	INCOMPREHENSIBLE_MESSAGE("/incromprehensible-message","Incomprehensible message"),
	DADOS_INVALIDOS("/dados-invalidos","Dados inválidos"),
	PARAMETRO_INVALIDO("/parametro-invalido","Parametro inválido"),
	ERRO_DE_SISTEMA("/erro-de-sistema","Erro interno");
	
	private String uri;
	private String title;
	
	private ProblemType(String uri,String title) {
		this.uri = uri;
		this.title = title;
	}
}
