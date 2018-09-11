package ch.interdiscount.knowhow.springgettingstarted.web.controller;

import ch.interdiscount.knowhow.springgettingstarted.web.converter.PersonsConverter;
import ch.interdiscount.knowhow.springgettingstarted.web.dto.PersonDto;
import ch.interdiscount.knowhow.springgettingstarted.web.model.PersonModel;
import ch.interdiscount.knowhow.springgettingstarted.web.repository.PersonModelRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonModelRepository personModelRepository;

    @Autowired
    private PersonsConverter personsConverter;

    @GetMapping
    public List<PersonDto> getAllPersons(){
        return personsConverter.convert(personModelRepository.findAll());
    }
}
