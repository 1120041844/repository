package org.javaboy.vhr.controller.statistics;


import org.javaboy.vhr.model.Production;
import org.javaboy.vhr.model.RespBean;
import org.javaboy.vhr.service.inter.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/statistics/all")
public class ProductionController {

    @Autowired
    ProductionService productionService;

    @GetMapping("/")
    public List<Map> countAll(){
        return productionService.countAll();
    }


    @PostMapping("/add")
    public RespBean add(@RequestBody Production production) {
       productionService.add(production);
       return RespBean.ok("添加成功");
    }

    @PostMapping("/update")
    public RespBean updateById(@RequestBody Production production) {
        productionService.update(production);
        return RespBean.ok("更新成功");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteById(@PathVariable Integer id) {
        productionService.delete(id);
        return RespBean.ok("删除成功");
    }
}
