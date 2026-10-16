package com.cybersoft.restfulapi.question3;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToOperationTypeCalculator implements Converter<String, OperatorCalculation> {

    @Override
    public OperatorCalculation convert(String source) {
        return OperatorCalculation.valueOf(source.toUpperCase());
    }
}
