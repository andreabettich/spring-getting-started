package ch.interdiscount.knowhow.springgettingstarted.web.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.Optional;

@NoRepositoryBean
public interface CustomRepository<T, ID extends Serializable> extends Repository<T, ID> {
    Optional<T> findById(ID id);

    <S extends T> S save(S entity);

    void delete(T entity);
}
