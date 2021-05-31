package com.hellokoding.springmvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MidOfficeController {

    /*  *  *  *  *  *  *  *  *
     *  mid-office/EXSCUDO   *
     *  *  *  *  *  *  *  *  */
    @GetMapping({"mid-office/exscudo/clients/migration"})
    public String midOfficeExscudoClientsMigration(Model model) {
        return "mid-office/EXSCUDO/clients/migration";
    }

    @GetMapping({"mid-office/exscudo/deposit/deposit_failure"})
    public String midOfficeExscudoDepositFailure(Model model) {
        return "mid-office/EXSCUDO/deposit/deposit_failure";
    }

    @GetMapping({"mid-office/exscudo/deposit/deposit_limit_email_template"})
    public String midOfficeExscudoDepositLimitEemailTemplate(Model model) {
        return "mid-office/EXSCUDO/deposit/deposit_limit_email_template";
    }

    @GetMapping({"mid-office/exscudo/deposit/deposit_success"})
    public String midOfficeExscudoDepositSuccess(Model model) {
        return "mid-office/EXSCUDO/deposit/deposit_success";
    }

    @GetMapping({"mid-office/exscudo/marginal/margin_call"})
    public String midOfficeExscudoMarginalMarginCall(Model model) {
        return "mid-office/EXSCUDO/marginal/margin_call";
    }

    @GetMapping({"mid-office/exscudo/marginal/margin_out_portfolios"})
    public String midOfficeExscudoMarginalMarginOutPortfolios(Model model) {
        return "mid-office/EXSCUDO/marginal/margin_out_portfolios";
    }

    @GetMapping({"mid-office/exscudo/reports/error_en"})
    public String midOfficeExscudoReportsErrorEn(Model model) {
        return "mid-office/EXSCUDO/reports/error_en";
    }

    @GetMapping({"mid-office/exscudo/reports/error_ru"})
    public String midOfficeExscudoReportsErrorRu(Model model) {
        return "mid-office/EXSCUDO/reports/error_ru";
    }

    @GetMapping({"mid-office/exscudo/reports/ready_en"})
    public String midOfficeExscudoReportsReadyEn(Model model) {
        return "mid-office/EXSCUDO/reports/ready_en";
    }

    @GetMapping({"mid-office/exscudo/reports/ready_ru"})
    public String midOfficeExscudoReportsReadyRu(Model model) {
        return "mid-office/EXSCUDO/reports/ready_ru";
    }

    @GetMapping({"mid-office/exscudo/veriff/fail"})
    public String midOfficeExscudoVeriffFail(Model model) {
        return "mid-office/EXSCUDO/veriff/fail";
    }

    @GetMapping({"mid-office/exscudo/veriff/success_ADDRESS"})
    public String midOfficeExscudoVeriffSuccessADDRESS(Model model) {
        return "mid-office/EXSCUDO/veriff/success_ADDRESS";
    }

    @GetMapping({"mid-office/exscudo/veriff/success_DEFAULT"})
    public String midOfficeExscudoVeriffSuccessDEFAULT(Model model) {
        return "mid-office/EXSCUDO/veriff/success_DEFAULT";
    }

    @GetMapping({"mid-office/exscudo/veriff/success_FORM"})
    public String midOfficeExscudoVeriffSuccessFORM(Model model) {
        return "mid-office/EXSCUDO/veriff/success_FORM";
    }

    @GetMapping({"mid-office/exscudo/voting/campaign"})
    public String midOfficeExscudoVotingCampaign(Model model) {
        return "mid-office/EXSCUDO/voting/campaign";
    }

    @GetMapping({"mid-office/exscudo/voting/vote"})
    public String midOfficeExscudoVotingVote(Model model) {
        return "mid-office/EXSCUDO/voting/vote";
    }

    @GetMapping({"mid-office/exscudo/withdrawals/rejection"})
    public String midOfficeExscudoWithdrawalsRejection(Model model) {
        return "mid-office/EXSCUDO/withdrawals/rejection";
    }


    /*  *  *  *  *  *  *  *  *
     *  mid-office/NIMERA    *
     *  *  *  *  *  *  *  *  */
    @GetMapping({"mid-office/nimera/clients/migration"})
    public String midOfficeNimeraClientsMigration(Model model) {
        return "mid-office/NIMERA/clients/migration";
    }

    @GetMapping({"mid-office/nimera/deposit/deposit_failure"})
    public String midOfficeNimeraDepositFailure(Model model) {
        return "mid-office/NIMERA/deposit/deposit_failure";
    }

    @GetMapping({"mid-office/nimera/deposit/deposit_limit_email_template"})
    public String midOfficeNimeraDepositLimitEemailTemplate(Model model) {
        return "mid-office/NIMERA/deposit/deposit_limit_email_template";
    }

    @GetMapping({"mid-office/nimera/deposit/deposit_success"})
    public String midOfficeNimeraDepositSuccess(Model model) {
        return "mid-office/NIMERA/deposit/deposit_success";
    }

    @GetMapping({"mid-office/nimera/marginal/margin_call"})
    public String midOfficeNimeraMarginalMarginCall(Model model) {
        return "mid-office/NIMERA/marginal/margin_call";
    }

    @GetMapping({"mid-office/nimera/marginal/margin_out_portfolios"})
    public String midOfficeNimeraMarginalMarginOutPortfolios(Model model) {
        return "mid-office/NIMERA/marginal/margin_out_portfolios";
    }

    @GetMapping({"mid-office/nimera/reports/error_en"})
    public String midOfficeNimeraReportsErrorEn(Model model) {
        return "mid-office/NIMERA/reports/error_en";
    }

    @GetMapping({"mid-office/nimera/reports/error_ru"})
    public String midOfficeNimeraReportsErrorRu(Model model) {
        return "mid-office/NIMERA/reports/error_ru";
    }

    @GetMapping({"mid-office/nimera/reports/ready_en"})
    public String midOfficeNimeraReportsReadyEn(Model model) {
        return "mid-office/NIMERA/reports/ready_en";
    }

    @GetMapping({"mid-office/nimera/reports/ready_ru"})
    public String midOfficeNimeraReportsReadyRu(Model model) {
        return "mid-office/NIMERA/reports/ready_ru";
    }

    @GetMapping({"mid-office/nimera/veriff/fail"})
    public String midOfficeNimeraVeriffFail(Model model) {
        return "mid-office/NIMERA/veriff/fail";
    }

    @GetMapping({"mid-office/nimera/veriff/success_ADDRESS"})
    public String midOfficeNimeraVeriffSuccessADDRESS(Model model) {
        return "mid-office/NIMERA/veriff/success_ADDRESS";
    }

    @GetMapping({"mid-office/nimera/veriff/success_DEFAULT"})
    public String midOfficeNimeraVeriffSuccessDEFAULT(Model model) {
        return "mid-office/NIMERA/veriff/success_DEFAULT";
    }

    @GetMapping({"mid-office/nimera/veriff/success_FORM"})
    public String midOfficeNimeraVeriffSuccessFORM(Model model) {
        return "mid-office/NIMERA/veriff/success_FORM";
    }

    @GetMapping({"mid-office/nimera/voting/campaign"})
    public String midOfficeNimeraVotingCampaign(Model model) {
        return "mid-office/NIMERA/voting/campaign";
    }

    @GetMapping({"mid-office/nimera/voting/vote"})
    public String midOfficeNimeraVotingVote(Model model) {
        return "mid-office/NIMERA/voting/vote";
    }

    @GetMapping({"mid-office/nimera/withdrawals/rejection"})
    public String midOfficeNimeraWithdrawalsRejection(Model model) {
        return "mid-office/NIMERA/withdrawals/rejection";
    }

}