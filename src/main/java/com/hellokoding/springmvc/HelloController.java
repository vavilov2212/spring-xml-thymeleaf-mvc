package com.hellokoding.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping({"/", "/hello"})
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    /*  *  *  *  *  *  *  *  *
     *  web-cabinet/NIMERA   *
     *  *  *  *  *  *  *  *  */
    @GetMapping({"web-cabinet/nimera/bank_account"})
    public String nimeraBankAccount(@RequestParam(value="name", required=false, defaultValue="World")Model model) {
        return "web-cabinet/NIMERA/bank_account";
    }
    @GetMapping({"/nimera/bank_account_eon"})
    public String nimeraBank_account_eon(Model model) {
        return "bank_account_eon";
    }
    @GetMapping({"/nimera/bank_account_russia"})
    public String nimeraBank_account_russia(Model model) {
        return "bank_account_russia";
    }
    @GetMapping({"/nimera/bank_account_sepa"})
    public String nimeraBank_account_sepa(Model model) {
        return "bank_account_sepa";
    }
    @GetMapping({"/nimera/bank_account_swift"})
    public String nimeraBank_account_swift(Model model) {
        return "bank_account_swift";
    }
    @GetMapping({"/nimera/email_ico_withdrawal_confirmation"})
    public String nimeraEmail_ico_withdrawal_confirmation(Model model) {
        return "email_ico_withdrawal_confirmation";
    }
    @GetMapping({"/nimera/email_kyc_questionnaire"})
    public String nimeraEmail_kyc_questionnaire(Model model) {
        return "email_kyc_questionnaire";
    }
    @GetMapping({"/nimera/email_password_new_sent"})
    public String nimeraEmail_password_new_sent(Model model) {
        return "email_password_new_sent";
    }
    @GetMapping({"/nimera/email_password_reset_confirmation"})
    public String nimeraEmail_password_reset_confirmation(Model model) {
        return "email_password_reset_confirmation";
    }
    @GetMapping({"/nimera/email_signup_already_confirmed_ss"})
    public String nimeraEmail_signup_already_confirmed_ss(Model model) {
        return "email_signup_already_confirmed_ss";
    }
    @GetMapping({"/nimera/email_signup_confirmation"})
    public String nimeraEmail_signup_confirmation(Model model) {
        return "email_signup_confirmation";
    }
    @GetMapping({"/nimera/email_signup_confirmed"})
    public String nimeraEmail_signup_confirmed(Model model) {
        return "email_signup_confirmed";
    }
    @GetMapping({"/nimera/email_user_exists_on_another_exchange_and_can_change_it"})
    public String nimeraEmail_user_exists_on_another_exchange_and_can_change_it(Model model) {
        return "email_user_exists_on_another_exchange_and_can_change_it";
    }
    @GetMapping({"/nimera/error"})
    public String nimeraError(Model model) {
        return "error";
    }
    @GetMapping({"/nimera/ico_withdraw_confirmed"})
    public String nimeraIco_withdraw_confirmed(Model model) {
        return "ico_withdraw_confirmed";
    }
    @GetMapping({"/nimera/ico_withdrawal_cancel_successful"})
    public String nimeraIco_withdrawal_cancel_successful(Model model) {
        return "ico_withdrawal_cancel_successful";
    }
    @GetMapping({"/nimera/need_password_change"})
    public String nimeraNeed_password_change(Model model) {
        return "need_password_change";
    }
    @GetMapping({"/nimera/veriff_fail"})
    public String nimeraVeriff_fail(Model model) {
        return "veriff_fail";
    }
    @GetMapping({"/nimera/veriff_success"})
    public String nimeraVeriff_success(Model model) {
        return "veriff_success";
    }
    @GetMapping({"/nimera/wallet_withdraw_status_successful"})
    public String nimeraWallet_withdraw_status_successful(Model model) {
        return "wallet_withdraw_status_successful";
    }

    /*  *  *  *  *  *  *  *  *
     *  web-cabinet/EXSCUDO  *
     *  *  *  *  *  *  *  *  */
    @GetMapping({"web-cabinet/exscudo/bank_account"})
    public String exscudoBankAccount(Model model) {
        return "web-cabinet/EXSCUDO/bank_account";
    }
    @GetMapping({"/exscudo/bank_account_eon"})
    public String exscudoBank_account_eon(Model model) {
        return "bank_account_eon";
    }
    @GetMapping({"/exscudo/bank_account_russia"})
    public String exscudoBank_account_russia(Model model) {
        return "bank_account_russia";
    }
    @GetMapping({"/exscudo/bank_account_sepa"})
    public String exscudoBank_account_sepa(Model model) {
        return "bank_account_sepa";
    }
    @GetMapping({"/exscudo/bank_account_swift"})
    public String exscudoBank_account_swift(Model model) {
        return "bank_account_swift";
    }
    @GetMapping({"/exscudo/email_ico_withdrawal_confirmation"})
    public String exscudoEmail_ico_withdrawal_confirmation(Model model) {
        return "email_ico_withdrawal_confirmation";
    }
    @GetMapping({"/exscudo/email_kyc_questionnaire"})
    public String exscudoEmail_kyc_questionnaire(Model model) {
        return "email_kyc_questionnaire";
    }
    @GetMapping({"/exscudo/email_password_new_sent"})
    public String exscudoEmail_password_new_sent(Model model) {
        return "email_password_new_sent";
    }
    @GetMapping({"/exscudo/email_password_reset_confirmation"})
    public String exscudoEmail_password_reset_confirmation(Model model) {
        return "email_password_reset_confirmation";
    }
    @GetMapping({"/exscudo/email_signup_already_confirmed_ss"})
    public String exscudoEmail_signup_already_confirmed_ss(Model model) {
        return "email_signup_already_confirmed_ss";
    }
    @GetMapping({"/exscudo/email_signup_confirmation"})
    public String exscudoEmail_signup_confirmation(Model model) {
        return "email_signup_confirmation";
    }
    @GetMapping({"/exscudo/email_signup_confirmed"})
    public String exscudoEmail_signup_confirmed(Model model) {
        return "email_signup_confirmed";
    }
    @GetMapping({"/exscudo/email_user_exists_on_another_exchange_and_can_change_it"})
    public String exscudoEmail_user_exists_on_another_exchange_and_can_change_it(Model model) {
        return "email_user_exists_on_another_exchange_and_can_change_it";
    }
    @GetMapping({"/exscudo/error"})
    public String exscudoError(Model model) {
        return "error";
    }
    @GetMapping({"/exscudo/ico_withdraw_confirmed"})
    public String exscudoIco_withdraw_confirmed(Model model) {
        return "ico_withdraw_confirmed";
    }
    @GetMapping({"/exscudo/ico_withdrawal_cancel_successful"})
    public String exscudoIco_withdrawal_cancel_successful(Model model) {
        return "ico_withdrawal_cancel_successful";
    }
    @GetMapping({"/exscudo/need_password_change"})
    public String exscudoNeed_password_change(Model model) {
        return "need_password_change";
    }
    @GetMapping({"/exscudo/veriff_fail"})
    public String exscudoVeriff_fail(Model model) {
        return "veriff_fail";
    }
    @GetMapping({"/exscudo/veriff_success"})
    public String exscudoVeriff_success(Model model) {
        return "veriff_success";
    }
    @GetMapping({"/exscudo/wallet_withdraw_status_successful"})
    public String exscudoWallet_withdraw_status_successful(Model model) {
        return "wallet_withdraw_status_successful";
    }
}