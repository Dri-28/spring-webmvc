package com.example.springwebmvc.rest;

import com.example.springwebmvc.model.Jedi;
import com.example.springwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JediResource {

    @Autowired
    private JediRepository repository;


    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi(){

        return repository.getAllJedi();

    }

    @GetMapping("/api/jedi/{id}")
    public Jedi getJedi(@PathVariable("id")Long id){
        return repository.findById(id).get();
    }
}
