package com.khotrizwan.angular8.repository;

import com.khotrizwan.angular8.model.City;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long>  {
    
}
