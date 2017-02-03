package org.fs.controller;

import org.fs.model.Model;
import org.fs.servis.imp.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {

    private ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @RequestMapping("/getAllModels")
    public Iterable<Model> getAllModels() {
        return modelService.getAllModels();
    }

    @RequestMapping("/saveModel")
    public void saveModel (@RequestBody Model model){
        modelService.saveModel(model);
    }

    @RequestMapping("/getModel")
    public Model getModel(@RequestBody int id){
        return modelService.getModel(id);
    }
}
