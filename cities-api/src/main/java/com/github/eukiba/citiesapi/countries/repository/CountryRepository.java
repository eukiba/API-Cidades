package com.github.eukiba.citiesapi.countries.repository;

import com.github.eukiba.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
