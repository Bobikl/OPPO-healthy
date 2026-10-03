package com.health.sleephrline.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/health/sleephrline/bean/HrPoint;", "", "()V", "x", "", "getX", "()I", "setX", "(I)V", "y", "", "getY", "()D", "setY", "(D)V", "toString", "", "SleepHrLine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HrPoint {
    private int x;
    private double y;

    public final int getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final void setX(int i) {
        this.x = i;
    }

    public final void setY(double d) {
        this.y = d;
    }

    @NotNull
    public String toString() {
        return "HrPoint(x=" + this.x + ", y=" + this.y + ')';
    }
}
