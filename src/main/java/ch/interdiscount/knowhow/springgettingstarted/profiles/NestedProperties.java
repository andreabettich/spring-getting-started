package ch.interdiscount.knowhow.springgettingstarted.profiles;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class NestedProperties {

    @NotEmpty
    private String name;
    @NotNull
    private int age;
}
