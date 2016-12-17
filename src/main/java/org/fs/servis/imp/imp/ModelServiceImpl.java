package org.fs.servis.imp.imp;

import org.fs.model.Model;
import org.fs.repository.ModelRepository;
import org.fs.servis.imp.ModelService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
@Transactional
public class ModelServiceImpl implements ModelService {

    @Resource
    private ModelRepository modelRepository;

    @Override
    public Model saveModel(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public Iterable<Model> getAllModels() {
        return modelRepository.findAll();
    }

    @Override
    public Model getModel(int id) {
        return modelRepository.findOne(id);
    }
}
