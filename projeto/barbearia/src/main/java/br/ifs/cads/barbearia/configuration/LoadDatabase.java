package br.ifs.cads.barbearia.configuration;

import br.ifs.cads.barbearia.model.Barbearia;
import br.ifs.cads.barbearia.repository.BarbeariaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BarbeariaRepository repository) {

        return args -> {
            Barbearia b = new Barbearia();
            b.setNome("Barbearia A");
            b.setEndereco("Aracaju");
            log.info("Preloading " + repository.save(b));
            b = new Barbearia();
            b.setNome("Barbearia Barra");
            b.setEndereco("Barra dos Coqueiros");
            log.info("Preloading " + repository.save(b));
        };
    }
}
