package co.edu.ucundinamarca.negocio.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }
    @Bean
    public Docket CustomerServiceApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis( springfox.documentation.builders.RequestHandlerSelectors.basePackage("co.edu.ucundinamarca.negocio.customerservice")).build();
    }
}
