package ch.interdiscount.knowhow.springgettingstarted.web.repository;

import ch.interdiscount.knowhow.springgettingstarted.web.model.GroupModel;
import org.springframework.lang.Nullable;

import java.util.List;
import java.util.Optional;

/**
 * Some examples how to use your own Repository with limited crud methodes.
 * Shows how to use the annotation Nullable and how to add java 8 optional.
 */
public interface GroupRepository extends CustomRepository<GroupModel, Long> {
    /**
     * Throws an EmptyResultDataAccessException when the query executed does not produce a result.
     * Throws an IllegalArgumentException when the location handed to the method is null.
     *
     * @param name name to search for
     * @return Groupmodel or throws EmptyResultDataAccessException
     */
    GroupModel getByName(final String name);

    /**
     * Returns null when the query executed does not produce a result.
     * Also accepts null as the value for name.
     *
     * @param name name to search for
     * @return null or Groupmodel
     */
    @Nullable
    GroupModel findByName(@Nullable final String name);

    /**
     * Returns a list of ordered Group model (ordered by name asc)
     *
     * @param name name to search for
     * @return sorted list of GroupModel
     */
    List<GroupModel> findByNameOrderByNameAsc(final String name);

    /**
     * Returns null when the query executed does not produce a result.
     * Also accepts null as the value for location.
     *
     * @param location location as String
     * @return null or list of groupmodel
     */
    @Nullable
    List<GroupModel> findByLocation(@Nullable String location);

    /**
     * Returns Optional.empty() when the query executed does not produce a result.
     * Throws an IllegalArgumentException when the emailAddress handed to the method is null.
     *
     * @param location location as String
     * @return Optional.empty() or list of Groupmodel
     */
    Optional<List<GroupModel>> findOptionalByLocation(String location);
}
