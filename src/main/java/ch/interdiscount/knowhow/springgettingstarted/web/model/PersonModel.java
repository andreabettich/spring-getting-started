package ch.interdiscount.knowhow.springgettingstarted.web.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class PersonModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

}
