package pl.touljaboy.model.reports.profitandloss;

import pl.touljaboy.model.reports.profitandloss.segments.Financial;
import pl.touljaboy.model.reports.profitandloss.segments.Operational;

import java.time.LocalDate;

public class ProfitAndLossAcc {
    public static final double INCOME_TAX = 0.19;
    private LocalDate localDate;
    private Operational operational;
    private Financial financial;
    private final double otherFinalCosts;
    private double result;


    public ProfitAndLossAcc(Operational operational, Financial financial, double otherFinalCosts, LocalDate localDate) {
        this.operational = operational;
        this.financial = financial;
        this.otherFinalCosts = otherFinalCosts;
        this.localDate=localDate;
        //calculate result on the go while constructing
        result = (financial.getResult()+operational.getResult())*(1-INCOME_TAX)-otherFinalCosts;
    }
    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getOtherFinalCosts() {
        return otherFinalCosts;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Operational getOperational() {
        return operational;
    }

    public void setOperational(Operational operational) {
        this.operational = operational;
    }

    public Financial getFinancial() {
        return financial;
    }

    public void setFinancial(Financial financial) {
        this.financial = financial;
    }
}


