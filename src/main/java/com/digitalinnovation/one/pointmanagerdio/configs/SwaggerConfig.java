package com.digitalinnovation.one.pointmanagerdio.configs;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.digitalinnovation.one.pointmanagerdio.domain.Usuario;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket forumApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.digitalinnovation.one.pointmanagerdio"))
				.paths(PathSelectors.ant("/**"))
				.build()
				.ignoredParameterTypes(Usuario.class)
				.apiInfo(apiInfo())
				.globalOperationParameters(Arrays.asList(
					new ParameterBuilder()
					.name("Authorization")
					.description("Header para token JWT")
					.modelRef(new ModelRef("string"))
					.parameterType("header")
					.required(false)
					.build()
				));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("API-REST")
				.description("Aula da DIO")
				.version("1.0.0")
				.license("Apache License Version 1.0.0")
				.licenseUrl("https://www.apache.org/")
				.build();
	}
}
