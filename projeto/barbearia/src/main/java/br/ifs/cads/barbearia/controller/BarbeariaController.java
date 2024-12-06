package br.ifs.cads.barbearia.controller;

import br.ifs.cads.barbearia.model.Barbearia;
import br.ifs.cads.barbearia.repository.BarbeariaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarbeariaController {
    @Autowired
    private BarbeariaRepository barbeariaRepository;

    @GetMapping("/barbearias")
    public Page<Barbearia> getAllPosts(Pageable pageable) {
        return barbeariaRepository.findAll(pageable);
    }

    @PostMapping("/barbearias")
    public Barbearia createPost(@Valid @RequestBody Barbearia barbearia) {
        return barbeariaRepository.save(barbearia);
    }

}
