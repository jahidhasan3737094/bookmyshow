package com.bookmyshow;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title = "Book my Show",
				version = "1.0.0",
				description = "RestfulApi Project for learning.Does the basic Crud operations.",
				termsOfService = "Jahid Hasan",
				contact = @Contact(
						name = "Jahid Hasan",
						email="jahidhasansaif094@gmail.com"
				),
				license = @License(
						name="Licence",
						url="http://localhost:8080/swagger-ui/index.html"
				)

		)
)
public class BookMyShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

}
