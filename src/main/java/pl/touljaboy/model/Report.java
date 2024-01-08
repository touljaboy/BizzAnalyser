package pl.touljaboy.model;

import pl.touljaboy.model.reports.balance.Balance;
import pl.touljaboy.model.reports.cashflow.CashFlow;
import pl.touljaboy.model.reports.profitandloss.ProfitAndLossAcc;

import java.time.LocalDate;

//report, based on polish accounting law which also follows the directives of international accounting rules,
//stores complete information about the company's current state.
public class Report {
    private LocalDate date;
    private Balance balance;
    private ProfitAndLossAcc profitAndLoss;
    private CashFlow cashFlow;

    public Report(LocalDate date, Balance balance, ProfitAndLossAcc profitAndLoss, CashFlow cashFlow) {
        this.date = date;
        this.balance = balance;
        this.profitAndLoss = profitAndLoss;
        this.cashFlow = cashFlow;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public ProfitAndLossAcc getProfitAndLoss() {
        return profitAndLoss;
    }

    public void setProfitAndLoss(ProfitAndLossAcc profitAndLoss) {
        this.profitAndLoss = profitAndLoss;
    }

    public CashFlow getCashFlow() {
        return cashFlow;
    }

    public void setCashFlow(CashFlow cashFlow) {
        this.cashFlow = cashFlow;
    }
}
