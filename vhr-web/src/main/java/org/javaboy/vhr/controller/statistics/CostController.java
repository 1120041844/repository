package org.javaboy.vhr.controller.statistics;

import org.javaboy.vhr.model.Cost;
import org.javaboy.vhr.model.RespBean;
import org.javaboy.vhr.service.inter.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/statistics/personnel")
public class CostController {

    @Autowired
    CostService costService;

    @GetMapping("/")
    public List<Map> getAll(){
        return costService.countAll();
    }

    @PostMapping("/add")
    public RespBean add(@RequestBody Cost cost){
        costService.add(cost);
        return RespBean.ok("添加完成");
    }

    @PostMapping("/update")
    public RespBean update(@RequestBody Cost cost){
        costService.update(cost);
        return RespBean.ok("修改完成");
    }

    @DeleteMapping("/{id}")
    public RespBean delete(@PathVariable Integer id){
        costService.delete(id);
        return RespBean.ok("删除完成");

    }

}
