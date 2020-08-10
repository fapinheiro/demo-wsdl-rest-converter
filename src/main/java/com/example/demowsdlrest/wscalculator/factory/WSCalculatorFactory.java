package com.example.demowsdlrest.wscalculator.factory;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.example.demowsdlrest.wscalculator.stubs.Calculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WSCalculatorFactory {
    
    @Value("${ws.calculator.wsdl.url}")
    private String wsdlUrl;

    public Calculator getInstance() throws MalformedURLException {
        return new Calculator(new URL(wsdlUrl), new QName("http://tempuri.org/", "Calculator"));
    }
}