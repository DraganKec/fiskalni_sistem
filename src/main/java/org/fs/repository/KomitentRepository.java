package org.fs.repository;

import org.fs.model.Komitent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dragan on 16/12/16.
 */
public interface KomitentRepository extends CrudRepository<Komitent, Integer> {

    @Query(value = "SELECT new org.fs.model.Komitent(k.id, k.nazivKomitenta) FROM Komitent k")
    Iterable<Komitent> getListOfKomitent();
}
