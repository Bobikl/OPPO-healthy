package com.heytap.store.payment.api;

import com.heytap.store.payment.p006const.PayConsKt;
import com.heytap.store.payment.strategy.PayType;
import com.heytap.store.payment.utils.Util;
import com.heytap.store.platform.tools.ContextGetterUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b4\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020a0`J\b\u0010b\u001a\u00020\nH\u0016J\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020a0`R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010\u0014R\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001c\u00102\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR\u001a\u00105\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR\u001a\u00108\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000eR\u001a\u0010;\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0012\"\u0004\b=\u0010\u0014R\u001e\u0010>\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010D\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\f\"\u0004\bF\u0010\u000eR\u001a\u0010G\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\f\"\u0004\bI\u0010\u000eR\u001a\u0010J\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR\u001a\u0010M\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000eR\"\u0010P\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010QX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\f\"\u0004\bX\u0010\u000eR\u001a\u0010Y\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\f\"\u0004\b[\u0010\u000eR\u001a\u0010\\\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u001e\"\u0004\b^\u0010 ¨\u0006d"}, d2 = {"Lcom/heytap/store/payment/api/PayParams;", "Ljava/io/Serializable;", "()V", "amount", "", "getAmount", "()D", "setAmount", "(D)V", "btnName", "", "getBtnName", "()Ljava/lang/String;", "setBtnName", "(Ljava/lang/String;)V", "callBackOnly", "", "getCallBackOnly", "()Z", "setCallBackOnly", "(Z)V", "channel", "getChannel", "setChannel", "defaultMethod", "getDefaultMethod", "setDefaultMethod", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", PayConsKt.FIRSTPRICE, "getFirstPrice", "setFirstPrice", "fqType", "getFqType", "setFqType", "free", "getFree", "setFree", "installment", "getInstallment", "setInstallment", "isHBPay", "setHBPay", PayConsKt.LASTPRICE, "getLastPrice", "setLastPrice", "lastRecommendPayMethod", "getLastRecommendPayMethod", "setLastRecommendPayMethod", "latitude", "getLatitude", "setLatitude", "longitude", "getLongitude", "setLongitude", "noToast", "getNoToast", "setNoToast", "onlyOne", "getOnlyOne", "()Ljava/lang/Boolean;", "setOnlyOne", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", PayConsKt.PAYMETHOD, "getPayMethod", "setPayMethod", "payMsg", "getPayMsg", "setPayMsg", "payParentMethod", "getPayParentMethod", "setPayParentMethod", "qiShu", "getQiShu", "setQiShu", "recommendPayMethods", "", "getRecommendPayMethods", "()Ljava/util/List;", "setRecommendPayMethods", "(Ljava/util/List;)V", "serial", "getSerial", "setSerial", "source", "getSource", "setSource", "startTime", "getStartTime", "setStartTime", "toMap", "", "", "toString", "toWebMiniPryMap", "pay_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PayParams implements Serializable {
    private double amount;
    private boolean callBackOnly;
    private long endTime;
    private double firstPrice;
    private boolean free;
    private boolean isHBPay;
    private double lastPrice;
    private boolean noToast;

    @Nullable
    private Boolean onlyOne;

    @Nullable
    private List<String> recommendPayMethods;
    private long startTime;

    @NotNull
    private String serial = "";

    @NotNull
    private String payMethod = "";

    @NotNull
    private String payParentMethod = "";

    @NotNull
    private String defaultMethod = "";

    @NotNull
    private String qiShu = "";

    @NotNull
    private String fqType = "";

    @NotNull
    private String longitude = "";

    @NotNull
    private String latitude = "";

    @NotNull
    private String installment = "";

    @NotNull
    private String payMsg = "";

    @NotNull
    private String channel = "";

    @NotNull
    private String source = "";

    @NotNull
    private String btnName = "";

    @Nullable
    private String lastRecommendPayMethod = "";

    public PayParams() {
        List<String> list;
        boolean z = false;
        if (Intrinsics.areEqual("", PayType.UP_PAY.getPayMethod()) && (list = this.recommendPayMethods) != null) {
            if (list != null && list.size() == 1) {
                List<String> list2 = this.recommendPayMethods;
                if (Intrinsics.areEqual(list2 == null ? null : list2.get(0), "miniprogram")) {
                    z = true;
                }
            }
        }
        this.isHBPay = z;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getBtnName() {
        return this.btnName;
    }

    public final boolean getCallBackOnly() {
        return this.callBackOnly;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getDefaultMethod() {
        return this.defaultMethod;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final double getFirstPrice() {
        return this.firstPrice;
    }

    @NotNull
    public final String getFqType() {
        return this.fqType;
    }

    public final boolean getFree() {
        return this.free;
    }

    @NotNull
    public final String getInstallment() {
        return this.installment;
    }

    public final double getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final String getLastRecommendPayMethod() {
        return this.lastRecommendPayMethod;
    }

    @NotNull
    public final String getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final String getLongitude() {
        return this.longitude;
    }

    public final boolean getNoToast() {
        return this.noToast;
    }

    @Nullable
    public final Boolean getOnlyOne() {
        return this.onlyOne;
    }

    @NotNull
    public final String getPayMethod() {
        return this.payMethod;
    }

    @NotNull
    public final String getPayMsg() {
        return this.payMsg;
    }

    @NotNull
    public final String getPayParentMethod() {
        return this.payParentMethod;
    }

    @NotNull
    public final String getQiShu() {
        return this.qiShu;
    }

    @Nullable
    public final List<String> getRecommendPayMethods() {
        return this.recommendPayMethods;
    }

    @NotNull
    public final String getSerial() {
        return this.serial;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: isHBPay, reason: from getter */
    public final boolean getIsHBPay() {
        return this.isHBPay;
    }

    public final void setAmount(double d) {
        this.amount = d;
    }

    public final void setBtnName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.btnName = str;
    }

    public final void setCallBackOnly(boolean z) {
        this.callBackOnly = z;
    }

    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channel = str;
    }

    public final void setDefaultMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.defaultMethod = str;
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setFirstPrice(double d) {
        this.firstPrice = d;
    }

    public final void setFqType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fqType = str;
    }

    public final void setFree(boolean z) {
        this.free = z;
    }

    public final void setHBPay(boolean z) {
        this.isHBPay = z;
    }

    public final void setInstallment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.installment = str;
    }

    public final void setLastPrice(double d) {
        this.lastPrice = d;
    }

    public final void setLastRecommendPayMethod(@Nullable String str) {
        this.lastRecommendPayMethod = str;
    }

    public final void setLatitude(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.latitude = str;
    }

    public final void setLongitude(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.longitude = str;
    }

    public final void setNoToast(boolean z) {
        this.noToast = z;
    }

    public final void setOnlyOne(@Nullable Boolean bool) {
        this.onlyOne = bool;
    }

    public final void setPayMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.payMethod = str;
    }

    public final void setPayMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.payMsg = str;
    }

    public final void setPayParentMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.payParentMethod = str;
    }

    public final void setQiShu(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.qiShu = str;
    }

    public final void setRecommendPayMethods(@Nullable List<String> list) {
        this.recommendPayMethods = list;
    }

    public final void setSerial(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serial = str;
    }

    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    @NotNull
    public final Map<String, Object> toMap() {
        String str = (Util.INSTANCE.isStoreAPP(ContextGetterUtils.INSTANCE.getApp()) || !Intrinsics.areEqual(this.payMethod, PayType.WECHAT_PAY.getPayMethod())) ? "app" : "mobile";
        String str2 = this.lastRecommendPayMethod;
        if (!(str2 == null || str2.length() == 0)) {
            str = this.lastRecommendPayMethod;
            Intrinsics.checkNotNull(str);
        }
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.to("serial", this.serial);
        String payMethod = this.payParentMethod;
        if (payMethod.length() == 0) {
            payMethod = getPayMethod();
        }
        pairArr[1] = TuplesKt.to("paymentCode", payMethod);
        pairArr[2] = TuplesKt.to("qiShu", this.qiShu);
        pairArr[3] = TuplesKt.to("fqType", this.fqType);
        pairArr[4] = TuplesKt.to("bankCode", str);
        pairArr[5] = TuplesKt.to("longitude", this.longitude);
        pairArr[6] = TuplesKt.to("latitude", this.latitude);
        pairArr[7] = TuplesKt.to("free", Boolean.valueOf(this.free));
        return MapsKt__MapsKt.mutableMapOf(pairArr);
    }

    @NotNull
    public String toString() {
        return "PayParams(serial='" + this.serial + "', payMethod='" + this.payMethod + "', channel='" + this.channel + "', qiShu='" + this.qiShu + "', fqType='" + this.fqType + "', longitude='" + this.longitude + "', latitude='" + this.latitude + "', installment='" + this.installment + "', amount='" + this.amount + "')";
    }

    @NotNull
    public final Map<String, Object> toWebMiniPryMap() {
        return MapsKt__MapsKt.mutableMapOf(TuplesKt.to("serial", this.serial), TuplesKt.to("paymentCode", this.payMethod), TuplesKt.to("qiShu", this.qiShu), TuplesKt.to("fqType", this.fqType), TuplesKt.to("bankCode", "miniprogram"), TuplesKt.to("longitude", this.longitude), TuplesKt.to("latitude", this.latitude), TuplesKt.to("free", Boolean.valueOf(this.free)), TuplesKt.to("free", Boolean.valueOf(this.free)), TuplesKt.to("free", Boolean.valueOf(this.free)));
    }
}
