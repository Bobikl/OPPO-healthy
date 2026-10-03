package com.health.sleephrline.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/health/sleephrline/bean/AsstInfoBean;", "", "()V", "detailClassification", "", "getDetailClassification", "()Ljava/lang/String;", "setDetailClassification", "(Ljava/lang/String;)V", "minPercentile", "", "getMinPercentile", "()D", "setMinPercentile", "(D)V", "minPoint", "Lcom/health/sleephrline/bean/HrPoint;", "getMinPoint", "()Lcom/health/sleephrline/bean/HrPoint;", "setMinPoint", "(Lcom/health/sleephrline/bean/HrPoint;)V", "setDetail", "", "toString", "SleepHrLine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AsstInfoBean {

    @Nullable
    private String detailClassification;
    private double minPercentile;

    @Nullable
    private HrPoint minPoint;

    @Nullable
    public final String getDetailClassification() {
        return this.detailClassification;
    }

    public final double getMinPercentile() {
        return this.minPercentile;
    }

    @Nullable
    public final HrPoint getMinPoint() {
        return this.minPoint;
    }

    public final void setDetail(@Nullable String detailClassification) {
        this.detailClassification = detailClassification;
    }

    public final void setDetailClassification(@Nullable String str) {
        this.detailClassification = str;
    }

    public final void setMinPercentile(double d) {
        this.minPercentile = d;
    }

    public final void setMinPoint(@Nullable HrPoint hrPoint) {
        this.minPoint = hrPoint;
    }

    @NotNull
    public String toString() {
        return "AsstInfoBean(minPoint=" + this.minPoint + ", minPercentile=" + this.minPercentile + ", detailClassification='" + this.detailClassification + "')";
    }
}
