package org.fs.servis.imp;

import org.fs.model.Model;

public interface ModelService {

    Model saveModel(Model model);

    Iterable<Model> getAllModels();

    Model getModel(int id);

}
