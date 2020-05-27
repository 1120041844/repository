package org.javaboy.vhr.service.inter;

import org.javaboy.vhr.model.Cost;
import org.javaboy.vhr.model.Production;

import java.util.List;
import java.util.Map;

public interface CostService {

    public List<Map> countAll();

    public void add(Cost cost);

    public void update(Cost cost);

    public void delete(Integer id);
}
