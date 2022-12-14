package vn.huce.da.ltudm.quanlychitieucanhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuanlychitieucanhanApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuanlychitieucanhanApplication.class, args);
	}
	
	@Bean
    	public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:4200");
            }
        };         
   	}

}
