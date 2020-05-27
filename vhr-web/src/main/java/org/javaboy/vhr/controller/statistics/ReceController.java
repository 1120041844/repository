package org.javaboy.vhr.controller.statistics;

import org.javaboy.vhr.service.inter.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/statistics/recored")
public class ReceController {

    @Autowired
    ProductionService productionService;

    @GetMapping("/")
    public List<Map> countAll(){
        return productionService.countRece();
    }


}
