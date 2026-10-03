package com.heytap.store.payment.strategy;

import com.heytap.store.payment.p006const.PayConsKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/heytap/store/payment/strategy/PayType;", "", PayConsKt.PAYMETHOD, "", "aliasName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAliasName", "()Ljava/lang/String;", "getPayMethod", "ALI_PAY", "WECHAT_PAY", "QMF_WECHAT_PAY", "HUABEI_PAY", "HUABEI_BFQ_PAY", "GROUP_PAY", "CCBBANK_PAY", "UNIONPAY_OPPO_PAY", "UNIONPAY_YSF_PAY", "HEYTAP_FQ_PAY", "UP_PAY", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public enum PayType {
    ALI_PAY("alipay", "支付宝支付"),
    WECHAT_PAY("weixin_js", "微信支付"),
    QMF_WECHAT_PAY("qmf_weixin", "全民付微信支付"),
    HUABEI_PAY("huabei", "花呗分期支付"),
    HUABEI_BFQ_PAY("huabei_bfq", "花呗支付"),
    GROUP_PAY("group_pay", "花呗分期+现金支付"),
    CCBBANK_PAY("ccbbank", "建设银行支付"),
    UNIONPAY_OPPO_PAY("union_pay_oppo", "OPPO Pay支付"),
    UNIONPAY_YSF_PAY("union_pay_ysf", "银联云闪付支付"),
    HEYTAP_FQ_PAY("heytap_fq", "欢太分期支付"),
    UP_PAY("cloud_union", "云闪付支付");


    @NotNull
    private final String aliasName;

    @NotNull
    private final String payMethod;

    PayType(String str, String str2) {
        this.payMethod = str;
        this.aliasName = str2;
    }

    @NotNull
    public final String getAliasName() {
        return this.aliasName;
    }

    @NotNull
    public final String getPayMethod() {
        return this.payMethod;
    }
}
