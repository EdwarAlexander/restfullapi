package com.jaax.restfullapi.controller;

import com.jaax.restfullapi.entity.Local;
import com.jaax.restfullapi.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocalController {

    @Autowired
    private LocalService localService;

    @GetMapping("/findAllLocals")
    public List<Local> findAllLocal(){
        return this.localService.findAllLocals();
    }
}
