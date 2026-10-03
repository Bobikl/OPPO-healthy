package com.heytap.store.payment.data;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class PayListDetails implements Serializable {
    private String ccbString;
    private String endTime;
    private double firstPrice;
    private boolean isFirstPay;
    private double lastPrice;
    private List<PaymentsListBean.DetailsBean.OrderDetailFormBean> orderDetailForms;
    private String orderPrice;
    private PaymentsListBean.OtherParamsFromBean otherParams;
    private String payMethod;
    private List<PaymentsListBean.DetailsBean.PaymentListFormBean> paymentListForms;
    private String startTime;

    public String getCcbString() {
        return this.ccbString;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public double getFirstPrice() {
        return this.firstPrice;
    }

    public double getLastPrice() {
        return this.lastPrice;
    }

    public List<PaymentsListBean.DetailsBean.OrderDetailFormBean> getOrderDetailForms() {
        return this.orderDetailForms;
    }

    public String getOrderPrice() {
        return this.orderPrice;
    }

    public PaymentsListBean.OtherParamsFromBean getOtherParams() {
        return this.otherParams;
    }

    public String getPayMethod() {
        return this.payMethod;
    }

    public List<PaymentsListBean.DetailsBean.PaymentListFormBean> getPaymentListForms() {
        return this.paymentListForms;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public boolean isFirstPay() {
        return this.isFirstPay;
    }

    public void setCcbString(String str) {
        this.ccbString = str;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setFirstPay(boolean z) {
        this.isFirstPay = z;
    }

    public void setFirstPrice(double d) {
        this.firstPrice = d;
    }

    public void setLastPrice(double d) {
        this.lastPrice = d;
    }

    public void setOrderDetailForms(List<PaymentsListBean.DetailsBean.OrderDetailFormBean> list) {
        this.orderDetailForms = list;
    }

    public void setOrderPrice(String str) {
        this.orderPrice = str;
    }

    public void setOtherParams(PaymentsListBean.OtherParamsFromBean otherParamsFromBean) {
        this.otherParams = otherParamsFromBean;
    }

    public void setPayMethod(String str) {
        this.payMethod = str;
    }

    public void setPaymentListForms(List<PaymentsListBean.DetailsBean.PaymentListFormBean> list) {
        this.paymentListForms = list;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }
}
