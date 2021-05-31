package com.hellokoding.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Kubera2faGuiController {

    /*  *  *  *  *  *  *
     *  *  *  *  *  *  *
     *  *  EXSCUDO  *  *
     *  *  *  *  *  *  *
     *  *  *  *  *  *  */
    @GetMapping({"kubera-2fa-gui/exscudo/email/insufficient-currency-amount"})
    public String Kubera2faGuiExscudoEmailInsufficientCurrencyAmount(Model model) {
        return "kubera-2fa-gui/EXSCUDO/email/insufficient-currency-amount";
    }

    /*  *  *  *  *  *  *
     *  *  *  *  *  *  *
     *  *  NIMERA   *  *
     *  *  *  *  *  *  *
     *  *  *  *  *  *  */
    @GetMapping({"kubera-2fa-gui/nimera/email/insufficient-currency-amount"})
    public String Kubera2faGuiNimeraEmailInsufficientCurrencyAmount(Model model) {
        return "kubera-2fa-gui/NIMERA/email/insufficient-currency-amount";
    }

}