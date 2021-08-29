package com.khotrizwan.angular8.services;


import java.util.List;
import java.util.Optional;

import com.khotrizwan.angular8.model.City;
import com.khotrizwan.angular8.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityService {
    
    @Autowired
    CityRepository repository;

    public List<City> getAllCities() {
        return (List<City>) repository.findAll();
    }

    public City getCity(long id) {
        Optional<City> cityOptional = repository.findById(id);
        if(cityOptional.isPresent()) {
            return cityOptional.get();
        }
        return null;
    }

    public City save(City city) {
        return repository.save(city);
    }
}
