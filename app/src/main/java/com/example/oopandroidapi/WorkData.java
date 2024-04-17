package com.example.oopandroidapi;

import java.math.BigDecimal;

public class WorkData {
    private BigDecimal workplaceSelfSufficiency;
    private BigDecimal employmentRate;

    public BigDecimal getWorkplaceSelfSufficiency() {
        return workplaceSelfSufficiency;
    }

    public void setWorkplaceSelfSufficiency(BigDecimal workplaceSelfSufficiency) {
        this.workplaceSelfSufficiency = workplaceSelfSufficiency;
    }

    public BigDecimal getEmploymentRate() {
        return employmentRate;
    }

    public void setEmploymentRate(BigDecimal employmentRate) {
        this.employmentRate = employmentRate;
    }
}
