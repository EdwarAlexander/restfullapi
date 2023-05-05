package com.jaax.restfullapi.service;

import com.jaax.restfullapi.entity.Local;
import com.jaax.restfullapi.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImpl implements LocalService {

    @Autowired
    private LocalRepository localRepository;

    @Override
    public List<Local> findAllLocals() {
        return this.localRepository.findAll();
    }
}
