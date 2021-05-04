package com.keremburak.Entities;

import com.keremburak.Abstract.Entity;

import java.util.Date;


public class Campaign implements Entity {
    private Date startDate;
    private Date finishDate;
    private double percentOfDiscount;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public double getPercentOfDiscount() {
        return percentOfDiscount;
    }

    public void setPercentOfDiscount(double percentOfDiscount) {
        this.percentOfDiscount = percentOfDiscount;
    }
}
