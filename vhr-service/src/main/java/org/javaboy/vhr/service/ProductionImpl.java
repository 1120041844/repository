package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.ProductionMapper;
import org.javaboy.vhr.model.Production;
import org.javaboy.vhr.service.inter.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductionImpl implements ProductionService {

    @Autowired
    ProductionMapper productionMapper;


    @Override
    public List<Map> countAll() {
        return productionMapper.getAllList();
    }

    @Override
    public List<Map> countRece() {
        return productionMapper.countRece();
    }

    @Override
    public void add(Production production) {
        productionMapper.insert(production);
    }

    @Override
    public void update(Production production) {
       productionMapper.update(production);
    }

    @Override
    public void delete(Integer id) {
        productionMapper.delete(id);
    }

}
