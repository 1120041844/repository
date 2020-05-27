package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.EmployeeremoveMapper;
import org.javaboy.vhr.model.Employeeremove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpMoveService {

    @Autowired
    EmployeeremoveMapper employeeremoveMapper;

    public void add(Employeeremove employeeremove){
        employeeremoveMapper.insert(employeeremove);
    }

    public Integer updateByPrimaryKeySelective(Employeeremove employeeremove){
        return employeeremoveMapper.updateByPrimaryKeySelective(employeeremove);
    }


}
