package br.ifs.cads.barbearia.repository;

import br.ifs.cads.barbearia.model.Barbearia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface BarbeariaRepository extends JpaRepository<Barbearia, Long> {
    List<Barbearia> findByNomeContaining(String nome);
    List<Barbearia> findByEnderecoLike(String likePattern);
}
