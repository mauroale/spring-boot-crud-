package br.com.pixcode.springbootcrudcontries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pixcode.springbootcrudcontries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}
