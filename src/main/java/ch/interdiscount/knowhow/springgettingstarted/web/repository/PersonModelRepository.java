package ch.interdiscount.knowhow.springgettingstarted.web.repository;

import ch.interdiscount.knowhow.springgettingstarted.web.model.PersonModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonModelRepository extends CrudRepository<PersonModel, Long> {
    List<PersonModel> findByLastName(final String lastName);
    List<PersonModel> findAll();
}
