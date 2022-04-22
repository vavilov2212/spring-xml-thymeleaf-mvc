package com.hellokoding.springmvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayFormController {

    /*  *  *  *  *  *  *
     *  payForm/FIAT   *
     *  *  *  *  *  *  */
    @GetMapping({"payForm/fiat/success"})
    public String payFormFiatSuccess(Model model) {
        return "payForm/FIAT/success";
    }

    @GetMapping({"payForm/fiat/error"})
    public String payFormFiatError(Model model) {
        return "payForm/FIAT/error";
    }

    @GetMapping({"payForm/fiat/partial"})
    public String payFormFiatPartial(Model model) {
        return "payForm/FIAT/partial";
    }

    /*  *  *  *  *  *  *
     *  payForm/CRYPTO   *
     *  *  *  *  *  *  */
    @GetMapping({"payForm/crypto/success"})
    public String payFormCryptoSuccess(Model model) {
        return "payForm/CRYPTO/success";
    }

    @GetMapping({"payForm/crypto/error"})
    public String payFormCryptoError(Model model) {
        return "payForm/CRYPTO/error";
    }

    @GetMapping({"payForm/crypto/partial"})
    public String payFormCryptoPartial(Model model) {
        return "payForm/CRYPTO/partial";
    }
}