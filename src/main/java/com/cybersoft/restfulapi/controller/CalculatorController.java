package com.cybersoft.restfulapi.controller;

import com.cybersoft.restfulapi.app.OperatorCalculation;
import com.cybersoft.restfulapi.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    private CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/{operation}")
    public String getResultCalculator(@PathVariable OperatorCalculation operation, @RequestParam String x, @RequestParam String y) {
//        if (operation.isEmpty()) {
//            throw new IllegalArgumentException("Type is required");
//        }

        try {
            int xNum = Integer.parseInt(x);
            int yNum = Integer.parseInt(y);

            return String.valueOf(service.calculate(xNum, yNum, operation));
        } catch (Exception e) {
            e.printStackTrace();

            throw new IllegalArgumentException("x or y is invalid");
        }
    }
}
