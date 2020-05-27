package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.CostMapper;
import org.javaboy.vhr.model.Cost;
import org.javaboy.vhr.service.inter.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
@Service
public class CostImpl implements CostService {

    @Autowired
    CostMapper costMapper;

    @Override
    public List<Map> countAll() {
        return costMapper.getAllList();
    }

    @Override
    public void add(Cost cost) {
        costMapper.insert(cost);
    }

    @Override
    public void update(Cost cost) {
        costMapper.update(cost);
    }

    @Override
    public void delete(Integer id) {
        costMapper.delete(id);
    }
}
