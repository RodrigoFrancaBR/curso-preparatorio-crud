package br.com.franca.web;

import org.glassfish.jersey.server.ResourceConfig;

public class CursoPreparatorioApplication extends ResourceConfig {
	public CursoPreparatorioApplication() {
		packages("br.com.franca.web.api.implement");
	}
}
