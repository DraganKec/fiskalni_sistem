package org.fs.servis.imp;

import org.fs.model.Kasa;

public interface KasaService {

    Kasa getKasa(int id);

    Iterable<Kasa> getAll();

    Kasa saveKasa(Kasa entity);

}
