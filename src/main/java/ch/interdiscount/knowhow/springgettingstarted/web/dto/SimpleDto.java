package ch.interdiscount.knowhow.springgettingstarted.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SimpleDto {
    private String name;
    private String lastName;
    private int age;
}
