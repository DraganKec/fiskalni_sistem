package org.fs.servis.imp.imp;

import org.fs.model.Kasa;
import org.fs.repository.KasaRepository;
import org.fs.servis.imp.KasaService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
@Transactional
public class KasaServiceImpl implements KasaService {

    @Resource
    private KasaRepository kasaRepository;

    @Override
    public Kasa getKasa(int id) {
        return kasaRepository.findOne(id);
    }

    @Override
    public Iterable<Kasa> getAll() {
        return kasaRepository.findAll();
    }

    @Override
    public Kasa saveKasa(Kasa entity) {
        return kasaRepository.save(entity);
    }


}
