package co.edu.org.cropscan.service.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mapperConfiguration {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
		}
}
