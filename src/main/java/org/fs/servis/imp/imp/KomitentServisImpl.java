package org.fs.servis.imp.imp;

import org.fs.model.Komitent;
import org.fs.repository.KomitentRepository;
import org.fs.servis.imp.KomitentServis;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Dragan on 16/12/16.
 */
@Component
@Transactional
public class KomitentServisImpl implements KomitentServis{

    @Resource
    private KomitentRepository komitentRepository;

    @Override
    public Iterable<Komitent> getAllKomitents() {
        return komitentRepository.findAll();
    }

    @Override
    public Iterable<Komitent> getNazivKomitenata() {
        return komitentRepository.getListOfKomitent();
    }
}
