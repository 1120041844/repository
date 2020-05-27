package org.javaboy.vhr.controller.hrmanager;

import org.javaboy.vhr.model.AdjustSalary;
import org.javaboy.vhr.model.Position;
import org.javaboy.vhr.model.RespBean;
import org.javaboy.vhr.model.Salary;
import org.javaboy.vhr.service.AdjustSalaryService;
import org.javaboy.vhr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/per/salary")
public class AdjustSalaryController {

    @Autowired
    AdjustSalaryService adjustSalaryService
            ;

    @GetMapping("/")
    public List getAllList() {
        return adjustSalaryService.getAllList();
    }

    @PutMapping("/")
    public RespBean updateSalaryById(@RequestBody AdjustSalary adjustSalary) {
        if (adjustSalaryService.update(adjustSalary) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}
