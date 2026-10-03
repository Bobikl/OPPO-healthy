package com.health.heartrate.nativelibrary.paras;

import androidx.annotation.Keep;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/health/heartrate/nativelibrary/paras/AlgoInputData;", "", "()V", "accTimeStampMs", "", "getAccTimeStampMs", "()J", "setAccTimeStampMs", "(J)V", "gyroTimeStampMs", "getGyroTimeStampMs", "setGyroTimeStampMs", "xAcc", "", "getXAcc", "()D", "setXAcc", "(D)V", "xGyro", "getXGyro", "setXGyro", "yAcc", "getYAcc", "setYAcc", "yGyro", "getYGyro", "setYGyro", "zAcc", "getZAcc", "setZAcc", "zGyro", "getZGyro", "setZGyro", "MeasureLibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AlgoInputData {
    private long accTimeStampMs;
    private long gyroTimeStampMs;
    private double xAcc;
    private double xGyro;
    private double yAcc;
    private double yGyro;
    private double zAcc;
    private double zGyro;

    public final long getAccTimeStampMs() {
        return this.accTimeStampMs;
    }

    public final long getGyroTimeStampMs() {
        return this.gyroTimeStampMs;
    }

    public final double getXAcc() {
        return this.xAcc;
    }

    public final double getXGyro() {
        return this.xGyro;
    }

    public final double getYAcc() {
        return this.yAcc;
    }

    public final double getYGyro() {
        return this.yGyro;
    }

    public final double getZAcc() {
        return this.zAcc;
    }

    public final double getZGyro() {
        return this.zGyro;
    }

    public final void setAccTimeStampMs(long j2) {
        this.accTimeStampMs = j2;
    }

    public final void setGyroTimeStampMs(long j2) {
        this.gyroTimeStampMs = j2;
    }

    public final void setXAcc(double d) {
        this.xAcc = d;
    }

    public final void setXGyro(double d) {
        this.xGyro = d;
    }

    public final void setYAcc(double d) {
        this.yAcc = d;
    }

    public final void setYGyro(double d) {
        this.yGyro = d;
    }

    public final void setZAcc(double d) {
        this.zAcc = d;
    }

    public final void setZGyro(double d) {
        this.zGyro = d;
    }
}
