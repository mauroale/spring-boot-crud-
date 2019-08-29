package br.com.pixcode.springbootcrudcontries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.pixcode.springbootcrudcontries.entities.Country;
import br.com.pixcode.springbootcrudcontries.repositories.CountryRepository;

@SpringBootApplication
public class SpringbootcrudContriesApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootcrudContriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		countryRepository.save( new Country("Earth","World"));
		countryRepository.save( new Country("China","Peking"));
		countryRepository.save( new Country("Germany","Berlin"));
		countryRepository.save( new Country("USA","Washington DC"));
		countryRepository.save( new Country("Russia","Moscow"));
		countryRepository.save( new Country("Namibia","Windhoek"));
		countryRepository.save( new Country("India","New Delhi"));
		countryRepository.save( new Country("North Korea","Pyongyang"));
		countryRepository.save( new Country("Kenya","Nairobi"));
		countryRepository.save( new Country("Jamaica","Kingston"));
		countryRepository.save( new Country("Brazil","Brasilia"));
		countryRepository.save( new Country("Egypt","Cairo"));
		countryRepository.save( new Country("Nigeria","Abuja"));
		countryRepository.save( new Country("Italy","Rome"));
		countryRepository.save( new Country("Earth","World"));
		countryRepository.save( new Country("Earth","World"));
		countryRepository.save( new Country("Earth","World"));
		countryRepository.save( new Country("Earth","World"));
		countryRepository.save( new Country("Earth","World"));
		countryRepository.save( new Country("Earth","World"));
		
	}

}
