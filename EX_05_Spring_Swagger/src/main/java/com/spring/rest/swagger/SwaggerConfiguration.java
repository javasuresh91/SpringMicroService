package com.spring.rest.swagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	 public static final Contact DEFAULT_CONTACT = new Contact("Sure", "12345", "xxx@gmil.com");
	private static final int VendorExtension = 0;
	  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Suresh Documentation", "Customise Swagger Info Documentation", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());

	  /*Access Link : http://localhost:8080//v2/api-docs
		Important Values : info , Tags, Path
		INFO : Load with the default Values(Changeable)
	*/
	@Bean  
	public Docket getApi() {
		Set<String> produces_consume = new HashSet<String>(Arrays.asList("application/json","application/xml"));
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO) /** It is used to change the defalut values to the project values it affects ly the documents*/
				.produces(produces_consume)
				.consumes(produces_consume);
	}
	
	
	
}
