package com.example.demowsdlrest.service;

import java.net.MalformedURLException;

import com.example.demowsdlrest.wscalculator.factory.WSCalculatorFactory;
import com.example.demowsdlrest.wscalculator.stubs.Calculator;
import com.example.demowsdlrest.wscalculator.stubs.CalculatorSoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    @Autowired
    private WSCalculatorFactory factory;

    public Integer add(Integer intA, Integer intB) {

        try {
            Calculator wsCalc = factory.getInstance(); // Criar o client do ws remoto
            CalculatorSoap webSocket = wsCalc.getCalculatorSoap(); // Criar websocket para o ws remoto
            return webSocket.add(intA, intB);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return -1;
    }

    public Integer subtract(Integer intA, Integer intB) {
        try {
            Calculator wsCalc = factory.getInstance(); // Criar o client do ws remoto
            CalculatorSoap webSocket = wsCalc.getCalculatorSoap(); // Criar websocket para o ws remoto
            return webSocket.subtract(intA, intB);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }

}