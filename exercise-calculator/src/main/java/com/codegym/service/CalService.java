package com.codegym.service;

import com.codegym.model.Parameter;
import org.springframework.stereotype.Service;

@Service
public class CalService {
    public double add(Parameter param) {
        return param.getNum1() + param.getNum2();
    }

    public double sub(Parameter param) {
        return param.getNum1() - param.getNum2();
    }

    public double mul(Parameter param) {
        return param.getNum1() * param.getNum2();
    }

    public double div(Parameter param) {
        return param.getNum1() / param.getNum2();
    }
}
