package com.example.demowsdlrest.controller;

import com.example.demowsdlrest.dto.ResponseDTO;
import com.example.demowsdlrest.service.CalculatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculadoraController {
 
    @Autowired
    private CalculatorService calculatorService;

    // @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping(path = "/calculadora")
    public ResponseEntity<ResponseDTO> calculate(
        @RequestParam(required=true, defaultValue = "1") Integer intA,
        @RequestParam(required=true, defaultValue = "1") Integer intB,
        @RequestParam(required=true, defaultValue = "add") String operation
        ) throws Throwable {

        ResponseDTO resp = new ResponseDTO();

        if ("add".equals(operation)) {
            resp.setResult(calculatorService.add(intA, intB));
        } else if ("subtract".equals(operation)) {
            resp.setResult(calculatorService.subtract(intA, intB));
        }
        
        return ResponseEntity.ok().body(resp);
    }


}