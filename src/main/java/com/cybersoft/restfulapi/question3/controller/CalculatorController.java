package com.cybersoft.restfulapi.question3.controller;

import com.cybersoft.restfulapi.question3.OperatorCalculation;
import com.cybersoft.restfulapi.question3.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    private CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/{operation}")
    public ResponseEntity<Integer> getResultCalculator(@PathVariable OperatorCalculation operation,
                                                       @RequestParam String x,
                                                       @RequestParam String y) {

        int xNum = Integer.parseInt(x);
        int yNum = Integer.parseInt(y);
        int result = service.calculate(xNum, yNum, operation);

        return ResponseEntity.ok(result);
    }
}
