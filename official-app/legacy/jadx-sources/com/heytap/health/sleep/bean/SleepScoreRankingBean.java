package com.heytap.health.sleep.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/sleep/bean/SleepScoreRankingBean;", "", "()V", "ageGroup", "", "getAgeGroup", "()I", "setAgeGroup", "(I)V", "ageRangeMax", "getAgeRangeMax", "setAgeRangeMax", "ageRangeMin", "getAgeRangeMin", "setAgeRangeMin", "scoreDistinct", "", "getScoreDistinct", "()Ljava/lang/String;", "setScoreDistinct", "(Ljava/lang/String;)V", "toString", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepScoreRankingBean {
    public static final int $stable = 8;
    private int ageGroup;
    private int ageRangeMax;
    private int ageRangeMin;

    @NotNull
    private String scoreDistinct = "";

    public final int getAgeGroup() {
        return this.ageGroup;
    }

    public final int getAgeRangeMax() {
        return this.ageRangeMax;
    }

    public final int getAgeRangeMin() {
        return this.ageRangeMin;
    }

    @NotNull
    public final String getScoreDistinct() {
        return this.scoreDistinct;
    }

    public final void setAgeGroup(int i) {
        this.ageGroup = i;
    }

    public final void setAgeRangeMax(int i) {
        this.ageRangeMax = i;
    }

    public final void setAgeRangeMin(int i) {
        this.ageRangeMin = i;
    }

    public final void setScoreDistinct(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scoreDistinct = str;
    }

    @NotNull
    public String toString() {
        return "SleepScoreRankingBean(ageGroup=" + this.ageGroup + ", ageRangeMin=" + this.ageRangeMin + ", ageRangeMax=" + this.ageRangeMax + ", scoreDistinct='" + this.scoreDistinct + "')";
    }
}
