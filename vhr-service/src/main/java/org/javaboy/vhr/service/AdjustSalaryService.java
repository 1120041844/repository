package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.AdjustSalaryMapper;
import org.javaboy.vhr.model.AdjustSalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AdjustSalaryService {

    @Autowired
    AdjustSalaryMapper adjustSalaryMapper;


    public List<AdjustSalary> getAllList() {
        return adjustSalaryMapper.getAllList();
    }


    public int update(AdjustSalary eid){
        return adjustSalaryMapper.updateByPrimaryKey(eid);
    }
}
