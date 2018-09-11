package ch.interdiscount.knowhow.springgettingstarted.cmd;

import ch.interdiscount.knowhow.springgettingstarted.web.model.PersonModel;
import ch.interdiscount.knowhow.springgettingstarted.web.repository.PersonModelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
@Slf4j
public class SimpleCommandLineRunner implements CommandLineRunner {

    @Autowired
    private PersonModelRepository personModelRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("SimpleCommandLineRunner");
        personModelRepository.save(new PersonModel("Hans", "Peter"));
        personModelRepository.save(new PersonModel("Fritz", "Meyer"));
        personModelRepository.save(new PersonModel("Peter", "Müller"));
        personModelRepository.save(new PersonModel("Andreas", "Ramser"));

        final Iterable<PersonModel> personModels = personModelRepository.findAll();
        for (PersonModel personModel: personModels) {
            log.info(personModel.getFirstName() + " " + personModel.getLastName());
        }
    }
}
