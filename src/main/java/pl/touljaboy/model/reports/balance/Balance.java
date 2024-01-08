package pl.touljaboy.model.reports.balance;

import pl.touljaboy.model.reports.balance.segments.EquityCapital;
import pl.touljaboy.model.reports.balance.segments.FixedAssets;
import pl.touljaboy.model.reports.balance.segments.Obligations;
import pl.touljaboy.model.reports.balance.segments.WorkingCapital;

import java.time.LocalDate;

public class Balance {
    private LocalDate localDate;
    private EquityCapital equity;
    private Obligations obligations;
    private FixedAssets fixedAssets;
    private WorkingCapital workingCapital;

    public Balance(EquityCapital equity, Obligations obligations, FixedAssets fixedAssets, WorkingCapital workingCapital, LocalDate localDate) {
        this.equity = equity;
        this.obligations = obligations;
        this.fixedAssets = fixedAssets;
        this.workingCapital = workingCapital;
        this.localDate=localDate;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public EquityCapital getEquity() {
        return equity;
    }

    public void setEquity(EquityCapital equity) {
        this.equity = equity;
    }

    public Obligations getObligations() {
        return obligations;
    }

    public void setObligations(Obligations obligations) {
        this.obligations = obligations;
    }

    public FixedAssets getFixedAssets() {
        return fixedAssets;
    }

    public void setFixedAssets(FixedAssets fixedAssets) {
        this.fixedAssets = fixedAssets;
    }

    public WorkingCapital getWorkingCapital() {
        return workingCapital;
    }

    public void setWorkingCapital(WorkingCapital workingCapital) {
        this.workingCapital = workingCapital;
    }
}
