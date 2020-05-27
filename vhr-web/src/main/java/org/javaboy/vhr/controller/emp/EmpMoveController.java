package org.javaboy.vhr.controller.emp;

import org.javaboy.vhr.model.Employeeremove;
import org.javaboy.vhr.service.EmpMoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/per/mv")
public class EmpMoveController {

    @Autowired
    EmpMoveService empMoveService;


    @GetMapping("/up")
    public Integer update(Employeeremove employeeremove){
        return empMoveService.updateByPrimaryKeySelective(employeeremove);
    }
}
