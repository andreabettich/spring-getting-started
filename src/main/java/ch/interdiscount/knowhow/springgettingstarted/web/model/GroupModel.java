package ch.interdiscount.knowhow.springgettingstarted.web.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "group")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class GroupModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;

    private String location;
}
