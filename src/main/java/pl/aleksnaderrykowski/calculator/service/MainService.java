package pl.aleksnaderrykowski.calculator.service;

import org.springframework.stereotype.Service;
import pl.aleksnaderrykowski.calculator.CalculatorDTO;

@Service
public class MainService {

    public double compute(CalculatorDTO calculatorDTO){
        switch(calculatorDTO.getOperator()){
            case "+":
                return calculatorDTO.getValue1() + calculatorDTO.getValue2();
            case "*":
                return calculatorDTO.getValue1() * calculatorDTO.getValue2();
            case "/":
                return calculatorDTO.getValue1() / calculatorDTO.getValue2();
            case "-":
                return calculatorDTO.getValue1() - calculatorDTO.getValue2();
            default:
                return 0;
        }
    }
}
