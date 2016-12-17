package org.fs.servis.imp;

import org.fs.model.Komitent;

/**
 * Created by Dragan on 16/12/16.
 */
public interface KomitentServis {

    Iterable<Komitent> getAllKomitents();

    Iterable<Komitent> getNazivKomitenata();
}
