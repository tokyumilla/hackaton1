package jump2digital.Hackaton;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jump2digital.Hackaton.model.entity.Skin;
import jump2digital.Hackaton.model.service.SkinService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class HackatonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackatonApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(SkinService skinService) {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Skin>> typeReference=new TypeReference<List<Skin>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/skins.json");
			try {
				List<Skin> skins = mapper.readValue(inputStream,typeReference);
				skinService.save(skins);
				System.out.println("Skins saved");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}

}
