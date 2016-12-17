package org.fs.servis.imp.imp;

import org.fs.model.Servis;
import org.fs.repository.ServisRepository;
import org.fs.servis.imp.ServisService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
@Transactional
public class ServisServiceImpl implements ServisService {

    @Resource
    private ServisRepository servisRepository;

    @Override
    public Servis saveServis(Servis servis) {
        return servisRepository.save(servis);
    }
}
