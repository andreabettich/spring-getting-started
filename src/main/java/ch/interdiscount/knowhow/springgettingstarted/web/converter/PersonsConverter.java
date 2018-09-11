package ch.interdiscount.knowhow.springgettingstarted.web.converter;

import ch.interdiscount.knowhow.springgettingstarted.web.dto.PersonDto;
import ch.interdiscount.knowhow.springgettingstarted.web.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class PersonsConverter implements Converter<List<PersonModel>, List<PersonDto>> {

    @Autowired
    private PersonConverter personConverter;

    @Override
    public List<PersonDto> convert(final List<PersonModel> source) {
        // Apache commons-collections could be used for emptyIfNull
        final List<PersonDto> persons = source.stream()
                .map(personModel -> personConverter.convert(personModel))
                .collect(Collectors.toList());
        return persons;
    }
}
