package com.health.sleephrline.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/health/sleephrline/bean/SleepHrResultBean;", "", "()V", "asstInfo", "Lcom/health/sleephrline/bean/AsstInfoBean;", "getAsstInfo", "()Lcom/health/sleephrline/bean/AsstInfoBean;", "setAsstInfo", "(Lcom/health/sleephrline/bean/AsstInfoBean;)V", "fittingLineList", "", "Lcom/health/sleephrline/bean/HrPoint;", "getFittingLineList", "()[Lcom/health/sleephrline/bean/HrPoint;", "[Lcom/health/sleephrline/bean/HrPoint;", "type", "", "getType", "()I", "setType", "(I)V", "toString", "", "SleepHrLine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SleepHrResultBean {

    @Nullable
    private AsstInfoBean asstInfo;

    @NotNull
    private final HrPoint[] fittingLineList = new HrPoint[0];
    private int type;

    @Nullable
    public final AsstInfoBean getAsstInfo() {
        return this.asstInfo;
    }

    @NotNull
    public final HrPoint[] getFittingLineList() {
        return this.fittingLineList;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAsstInfo(@Nullable AsstInfoBean asstInfoBean) {
        this.asstInfo = asstInfoBean;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "SleepHrResultBean(type=" + this.type + ", fittingLineList size=" + this.fittingLineList.length + ", asstInfo=" + this.asstInfo + ')';
    }
}
