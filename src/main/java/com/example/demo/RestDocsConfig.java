/**
 * 
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * @author Dell
 *
 */
@Configuration
public class RestDocsConfig {

    @Bean
    OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
		return new OpenAPI()
						.info(new Info()
						.title("Demo API")
						.version(appVersion)
						.description("This is a sample server created using springdocs - a library for OpenAPI 3 with spring boot.")
						.termsOfService("http://swagger.io/terms/")
						.license(new License()
						.name("Apache 2.0")
						.url("http://springdoc.org")));
	}

}
