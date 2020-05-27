package org.javaboy.vhr.service.inter;

import org.javaboy.vhr.model.Production;

import java.util.List;
import java.util.Map;

public interface ProductionService {

    public List<Map> countAll();

    public List<Map> countRece();


    public void add(Production production);

    public void update(Production production);

    public void delete(Integer id);
}
