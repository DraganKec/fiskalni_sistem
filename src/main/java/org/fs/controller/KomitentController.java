package org.fs.controller;

import org.fs.model.Komitent;
import org.fs.servis.imp.KomitentServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dragan on 16/12/16.
 */
@RestController
public class KomitentController {

    private KomitentServis komitentServis;

    @Autowired
    public KomitentController(KomitentServis komitentService) {
        this.komitentServis = komitentService;
    }

    @RequestMapping("/getAllKomitents")
    public Iterable<Komitent> getAllKomitents() {
        return komitentServis.getAllKomitents();
    }

    @RequestMapping("/getNazivKomitenta")
    public Iterable<Komitent> getNazivKomitenta() {
        return komitentServis.getNazivKomitenata();
    }
}
