package com.example.anas_elboujjoufi_jft;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TafelController {

    private final Calculator calculator;

    public TafelController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/bereken")
    public String bereken(@RequestParam("getal") int getal, Model model) {
        try {
            int[] resultaat = calculator.tafelVan(getal);
            model.addAttribute("resultaat", resultaat);
        } catch (ArithmeticException e) {
            // Handel de foutmelding af, bijvoorbeeld door een foutbericht in de model toe te voegen.
        }
        return "resultaat";
    }
}
