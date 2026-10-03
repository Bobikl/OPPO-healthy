package com.oplus.deepthinker.sdk.app.userprofile.labels;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001(B?\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J!\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003JI\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"¨\u0006)"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/userprofile/labels/PaymentPreference;", "", "", "component1", "", "", "", "component2", "component3", "component4", "generateTime", "payStatInfo", "numOfPaymentDay", "totalDay", "copy", "toString", "hashCode", "other", "", "equals", "J", "getGenerateTime", "()J", "setGenerateTime", "(J)V", "Ljava/util/Map;", "getPayStatInfo", "()Ljava/util/Map;", "setPayStatInfo", "(Ljava/util/Map;)V", "I", "getNumOfPaymentDay", "()I", "setNumOfPaymentDay", "(I)V", "getTotalDay", "setTotalDay", "<init>", "(JLjava/util/Map;II)V", "Companion", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class PaymentPreference {

    @NotNull
    public static final String PAY_BY_CODE = "PAY_BY_CODE";

    @NotNull
    public static final String PAY_BY_SCAN = "PAY_BY_SCAN";
    private long generateTime;
    private int numOfPaymentDay;

    @NotNull
    private Map<String, ? extends Map<String, Integer>> payStatInfo;
    private int totalDay;

    public PaymentPreference(long j2, @NotNull Map<String, ? extends Map<String, Integer>> payStatInfo, int i, int i2) {
        Intrinsics.checkNotNullParameter(payStatInfo, "payStatInfo");
        this.generateTime = j2;
        this.payStatInfo = payStatInfo;
        this.numOfPaymentDay = i;
        this.totalDay = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentPreference copy$default(PaymentPreference paymentPreference, long j2, Map map, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = paymentPreference.generateTime;
        }
        long j3 = j2;
        if ((i3 & 2) != 0) {
            map = paymentPreference.payStatInfo;
        }
        Map map2 = map;
        if ((i3 & 4) != 0) {
            i = paymentPreference.numOfPaymentDay;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = paymentPreference.totalDay;
        }
        return paymentPreference.copy(j3, map2, i4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final Map<String, Map<String, Integer>> component2() {
        return this.payStatInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNumOfPaymentDay() {
        return this.numOfPaymentDay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalDay() {
        return this.totalDay;
    }

    @NotNull
    public final PaymentPreference copy(long generateTime, @NotNull Map<String, ? extends Map<String, Integer>> payStatInfo, int numOfPaymentDay, int totalDay) {
        Intrinsics.checkNotNullParameter(payStatInfo, "payStatInfo");
        return new PaymentPreference(generateTime, payStatInfo, numOfPaymentDay, totalDay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPreference)) {
            return false;
        }
        PaymentPreference paymentPreference = (PaymentPreference) other;
        return this.generateTime == paymentPreference.generateTime && Intrinsics.areEqual(this.payStatInfo, paymentPreference.payStatInfo) && this.numOfPaymentDay == paymentPreference.numOfPaymentDay && this.totalDay == paymentPreference.totalDay;
    }

    public final long getGenerateTime() {
        return this.generateTime;
    }

    public final int getNumOfPaymentDay() {
        return this.numOfPaymentDay;
    }

    @NotNull
    public final Map<String, Map<String, Integer>> getPayStatInfo() {
        return this.payStatInfo;
    }

    public final int getTotalDay() {
        return this.totalDay;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.generateTime) * 31) + this.payStatInfo.hashCode()) * 31) + Integer.hashCode(this.numOfPaymentDay)) * 31) + Integer.hashCode(this.totalDay);
    }

    public final void setGenerateTime(long j2) {
        this.generateTime = j2;
    }

    public final void setNumOfPaymentDay(int i) {
        this.numOfPaymentDay = i;
    }

    public final void setPayStatInfo(@NotNull Map<String, ? extends Map<String, Integer>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.payStatInfo = map;
    }

    public final void setTotalDay(int i) {
        this.totalDay = i;
    }

    @NotNull
    public String toString() {
        return "PaymentPreference(generateTime=" + this.generateTime + ", payStatInfo=" + this.payStatInfo + ", numOfPaymentDay=" + this.numOfPaymentDay + ", totalDay=" + this.totalDay + ')';
    }
}
