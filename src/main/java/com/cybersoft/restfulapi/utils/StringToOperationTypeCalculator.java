package com.cybersoft.restfulapi.utils;

import com.cybersoft.restfulapi.app.OperatorCalculation;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToOperationTypeCalculator implements Converter<String, OperatorCalculation> {

    @Override
    public OperatorCalculation convert(String source) {
        return OperatorCalculation.valueOf(source.toUpperCase());
    }
}
