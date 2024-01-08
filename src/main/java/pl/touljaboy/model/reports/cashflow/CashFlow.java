package pl.touljaboy.model.reports.cashflow;

import pl.touljaboy.model.reports.cashflow.segments.Financial;
import pl.touljaboy.model.reports.cashflow.segments.Investment;
import pl.touljaboy.model.reports.cashflow.segments.Operational;

import java.time.LocalDate;

public class CashFlow {
    private LocalDate localDate;

    public CashFlow(LocalDate localDate, Financial financial, Operational operational, Investment investment, double deltaCash, double startCash, double endCash) {
        this.localDate = localDate;
        this.financial = financial;
        this.operational = operational;
        this.investment = investment;
        this.deltaCash = deltaCash;
        this.startCash = startCash;
        this.endCash = endCash;
    }

    private Financial financial;
    private Operational operational;
    private Investment investment;

    //increase of decrease of monetary means, based on Balance sheet, which also includes the change resulting from
    //fluctuations of currency exchange market (E)
    private double deltaCash;

    //Cash in the beginning of the reporting cycle (F)
    private double startCash;

    //Cash in the end of the reporting cycle (G)
    private double endCash;
}
