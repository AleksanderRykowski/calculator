package pl.aleksnaderrykowski.calculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.aleksnaderrykowski.calculator.CalculatorDTO;
import pl.aleksnaderrykowski.calculator.service.MainService;

//wskauje na protokol http, umozliwia komunikajce
//wstrzykiwanie zaleznosci
@Controller
@RequiredArgsConstructor
public class MainController {

        private final MainService mainService;

        @GetMapping("/")
        public String getHome(Model model){
            model.addAttribute("value1",0);
            model.addAttribute("value2",0);
            model.addAttribute("result",0);
            return "index";
        }
        @PostMapping("/")
        public String postHome(@ModelAttribute CalculatorDTO calculatorDTO, Model model){
            System.out.println(calculatorDTO);
            model.addAttribute("value1",calculatorDTO.getValue1());
            model.addAttribute("value2",calculatorDTO.getValue2());
            model.addAttribute("result",mainService.compute(calculatorDTO));
            return "index";
        }



}
