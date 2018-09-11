package ch.interdiscount.knowhow.springgettingstarted.web.converter;

import ch.interdiscount.knowhow.springgettingstarted.web.dto.PersonDto;
import ch.interdiscount.knowhow.springgettingstarted.web.model.PersonModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PersonConverter implements Converter<PersonModel, PersonDto> {
    @Override
    public PersonDto convert(final PersonModel source) {
        final PersonDto person = new PersonDto();
        person.setFirstName(source.getFirstName());
        person.setLastName(source.getLastName());
        person.setSomething(String.valueOf(source.hashCode()));
        return person;
    }
}
