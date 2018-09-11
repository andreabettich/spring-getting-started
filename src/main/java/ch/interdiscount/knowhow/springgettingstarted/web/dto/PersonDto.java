package ch.interdiscount.knowhow.springgettingstarted.web.dto;

import lombok.Data;

@Data
public class PersonDto {
    private String firstName;
    private String lastName;
    private String something;

    public String getFullName(){
        return String.format("%s %s", firstName, lastName);
    }
}
